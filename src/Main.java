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

        questoes[6] = new Questao();
        questoes[6].pergunta = "Qual campeão utiliza um tambor como instrumento de batalha?";
        questoes[6].opcaoA = "a) Jhin";
        questoes[6].opcaoB = "b) Illaoi";
        questoes[6].opcaoC = "c) Sona";
        questoes[6].opcaoD = "d) Kled";
        questoes[6].opcaoE = "e) Sett";
        questoes[6].correta = "b";

        questoes[7] = new Questao();
        questoes[7].pergunta = "Qual campeão pode invocar o 'Caminho da Serpente'?";
        questoes[7].opcaoA = "a) Azir";
        questoes[7].opcaoB = "b) Cassiopeia";
        questoes[7].opcaoC = "c) K'Sante";
        questoes[7].opcaoD = "d) Rakan";
        questoes[7].opcaoE = "e) Aatrox";
        questoes[7].correta = "c";

        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual campeão pode roubar as ultimates de outros campeões?";
        questoes[8].opcaoA = "a) LeBlanc";
        questoes[8].opcaoB = "b) Sylas";
        questoes[8].opcaoC = "c) Neeko";
        questoes[8].opcaoD = "d) Zed";
        questoes[8].opcaoE = "e) Viego";
        questoes[8].correta = "b";

        questoes[9] = new Questao();
        questoes[9].pergunta = "Qual é o nome do dragão gigante que aparece no final das partidas de ARAM?";
        questoes[9].opcaoA = "a) Dragão Ancião";
        questoes[9].opcaoB = "b) Dragão das Nuvens";
        questoes[9].opcaoC = "c) Dragão de Gelo";
        questoes[9].opcaoD = "d) Dragão da Morte";
        questoes[9].opcaoE = "e) Dragão da Tempestade";
        questoes[9].correta = "c";

        questoes[10] = new Questao();
        questoes[10].pergunta = "Qual é o nome do evento global que define o campeão mundial de League of Legends?";
        questoes[10].opcaoA = "a) All-Star";
        questoes[10].opcaoB = "b) MSI";
        questoes[10].opcaoC = "c) Worlds";
        questoes[10].opcaoD = "d) Rift Rivals";
        questoes[10].opcaoE = "e) LCS";
        questoes[10].correta = "c";

        questoes[11] = new Questao();
        questoes[11].pergunta = "Qual é o principal objetivo do jogo em Summoner's Rift?";
        questoes[11].opcaoA = "a) Derrotar todos os inimigos";
        questoes[11].opcaoB = "b) Destruir a base inimiga";
        questoes[11].opcaoC = "c) Capturar o Dragão";
        questoes[11].opcaoD = "d) Roubar o Barão";
        questoes[11].opcaoE = "e) Coletar ouro";
        questoes[11].correta = "b";

        questoes[12] = new Questao();
        questoes[12].pergunta = "Qual campeão tem como frase icônica 'Justiceiro imortal'?";
        questoes[12].opcaoA = "a) Aatrox";
        questoes[12].opcaoB = "b) Riven";
        questoes[12].opcaoC = "c) Mordekaiser";
        questoes[12].opcaoD = "d) Tryndamere";
        questoes[12].opcaoE = "e) Nasus";
        questoes[12].correta = "c";

        questoes[13] = new Questao();
        questoes[13].pergunta = "Qual campeão tem a habilidade de cura em área chamada 'Canção da Celeridade'?";
        questoes[13].opcaoA = "a) Soraka";
        questoes[13].opcaoB = "b) Sona";
        questoes[13].opcaoC = "c) Nami";
        questoes[13].opcaoD = "d) Janna";
        questoes[13].opcaoE = "e) Yuumi";
        questoes[13].correta = "b";

        questoes[14] = new Questao();
        questoes[14].pergunta = "Qual é o nome do campeão que tem como forma passiva 'Ascensão Demoníaca'?";
        questoes[14].opcaoA = "a) Aatrox";
        questoes[14].opcaoB = "b) Veigar";
        questoes[14].opcaoC = "c) Malzahar";
        questoes[14].opcaoD = "d) Vladimir";
        questoes[14].opcaoE = "e) Karthus";
        questoes[14].correta = "a";



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