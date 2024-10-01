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

        questoes[3] = new Questao();
        questoes[3].pergunta = "Qual campeão é conhecido por seus cogumelos explosivos?";
        questoes[3].opcaoA = "a) Rumble";
        questoes[3].opcaoB = "b) Singed";
        questoes[3].opcaoC = "c) Teemo";
        questoes[3].opcaoD = "d) Zyra";
        questoes[3].opcaoE = "e) Ivern";
        questoes[3].correta = "c";

        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual dragão não fornece buffs permanentes, mas muda a geografia do mapa?";
        questoes[4].opcaoA = "a) Dragão Infernal";
        questoes[4].opcaoB = "b) Dragão das Nuvens";
        questoes[4].opcaoC = "c) Dragão Hextec";
        questoes[4].opcaoD = "d) Dragão Ancião";
        questoes[4].opcaoE = "e) Dragão Quimtec";
        questoes[4].correta = "e";

        questoes[5] = new Questao();
        questoes[5].pergunta = "Quem é o irmão de Yasuo no lore de 'League of Legends'?";
        questoes[5].opcaoA = "a) Zed";
        questoes[5].opcaoB = "b) Yone";
        questoes[5].opcaoC = "c) Jhin";
        questoes[5].opcaoD = "d) Shen";
        questoes[5].opcaoE = "e) Lee Sin";
        questoes[5].correta = "b";


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