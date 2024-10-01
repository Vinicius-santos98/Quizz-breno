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

        questoes[1] = new Questao();
        questoes[1].pergunta = "Qual é o nome do mapa principal onde acontecem as partidas ranqueadas?";
        questoes[1].opcaoA = "a) Floresta Retorcida";
        questoes[1].opcaoB = "b) Abismo dos Lamentos";
        questoes[1].opcaoC = "c) Summoner's Rift";
        questoes[1].opcaoD = "d) Campos da Justiça";
        questoes[1].opcaoE = "e) Convergence";
        questoes[1].correta = "c";

        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual é o campeão conhecido como 'A Mão de Noxus'?";
        questoes[2].opcaoA = "a) Swain";
        questoes[2].opcaoB = "b) Darius";
        questoes[2].opcaoC = "c) Draven";
        questoes[2].opcaoD = "d) Riven";
        questoes[2].opcaoE = "e) Talon";
        questoes[2].correta = "b";


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