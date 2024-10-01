public class Main {
    public static void main(String[] args) {

        int acertos = 0;
        int erros = 0;

        Questao[] questoes = new Questao[15];

        System.out.println("Faculdade: Unifan");
        System.out.println("Aluno: Vinícius Santos de Carvalho");
        System.out.println("Docente: Brenno Pimenta");
        System.out.println("Turma: ESN2 - B");
        System.out.println("Quiz de LOL, bora fazer!");

        questoes[0] = new Questao();
        questoes[0].pergunta = "Qual campeão foi o primeiro lançado no jogo?";
        questoes[0].opcaoA = "a) Garen";
        questoes[0].opcaoB = "b) Twisted Fate";
        questoes[0].opcaoC = "c) Annie";
        questoes[0].opcaoD = "d) Alistar";
        questoes[0].opcaoE = "e) Ryze";
        questoes[0].correta = "e";

        for (int i = 0; i < 15; i++) {
            questoes[i].escrevaQuestao();
            String respostaUsuario = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        double porcentagemAcertos = ((double) acertos / 15) * 100;

        System.out.println("Resultado Final:");
        System.out.println("Você acertou " + acertos + " de 15.");
        System.out.println("Você errou " + erros + " de 15.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}