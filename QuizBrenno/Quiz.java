package QuizBrenno;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println();


        //Cabeçalho
        Cabecalho cabecalho = new Cabecalho();
        cabecalho.aluno = "Alexandry Vieira Garcia";
        cabecalho.professor = "Brenno Pimenta";
        cabecalho.curso = "Engenharia de Software";
        cabecalho.materia = "Algoritmo e Programação II";
        cabecalho.tema = "Futebol";

        System.out.println("-------------------------------CABEÇALHO---------------------------------------");
        System.out.println("                      Aluno: " + cabecalho.aluno);
        System.out.println("                      Professor: " + cabecalho.professor);
        System.out.println("                      Curso: " + cabecalho.curso);
        System.out.println("                      Matéria: " + cabecalho.materia);
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("                         Tema:" + cabecalho.tema);
        System.out.println("======================================================================");
        System.out.println("======================================================================");

        //Inicio das questões
        Questao questao1 = new Questao();
        questao1.pergunta ="1) Qual o maior artilheiro de Portugal?";
        questao1.opcoes[0] ="A - Eusebio ";
        questao1.opcoes[1] ="B - Cristiano Ronaldo";
        questao1.opcoes[2] ="C - Otávio ";
        questao1.opcoes[3] ="D - Bruno Fernandes ";
        questao1.opcoes[4] ="E - Bernardo Silva ";
        questao1.questaoCorreta = "B";
        // Leitura e validaçao da resposta
        if (questao1.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao2 = new Questao();
        questao2.pergunta ="2) Quem venceu a ultima bola de ouro?";
        questao2.opcoes[0] ="A - Haaland  ";
        questao2.opcoes[1] ="B - Messi";
        questao2.opcoes[2] ="C - Kaka ";
        questao2.opcoes[3] ="D - Cristiano Ronaldo";
        questao2.opcoes[4] ="E - Vinicuis Junior ";
        questao2.questaoCorreta = "B";

        if (questao2.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao3 = new Questao();
        questao3.pergunta ="3) Quem fez o gol que deu o título da Champions League 22-23 para o Manchester City?";
        questao3.opcoes[0] ="A - Haaland ";
        questao3.opcoes[1] ="B - Grealish";
        questao3.opcoes[2] ="C - Alvarez ";
        questao3.opcoes[3] ="D - Rodrigo ";
        questao3.opcoes[4] ="E - Bernado Silva ";
        questao3.questaoCorreta = "D";

        if (questao3.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao4 = new Questao();
        questao4.pergunta ="4) Qual time venceu o Brasileirão 2023?";
        questao4.opcoes[0] ="A - Palmeiras ";
        questao4.opcoes[1] ="B - Botafogo ";
        questao4.opcoes[2] ="C - Flamengo";
        questao4.opcoes[3] ="D - Grêmio";
        questao4.opcoes[4] ="E - Bragatino";
        questao4.questaoCorreta = "A";

        if (questao4.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao5 = new Questao();
        questao5.pergunta ="5) Qual time não tem mundial?";
        questao5.opcoes[0] ="A - Corinthians";
        questao5.opcoes[1] ="B - Internaciona";
        questao5.opcoes[2] ="C - Flamengo";
        questao5.opcoes[3] ="D - São Paulo";
        questao5.opcoes[4] ="E - Palmeiras";
        questao5.questaoCorreta = "E";

        if (questao5.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao6 = new Questao();
        questao6.pergunta ="6) Quem ganhou o prêmio puskas de 2011?";
        questao6.opcoes[0] ="A - Messi ";
        questao6.opcoes[1] ="B - Bellingham";
        questao6.opcoes[2] ="C - Neymar";
        questao6.opcoes[3] ="D - Ronaldinho";
        questao6.opcoes[4] ="E - Cristiano Ronaldo";
        questao6.questaoCorreta = "C";

        if (questao6.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }

        Questao questao7 = new Questao();
        questao7.pergunta ="7) Quem ganhou a copa do mundo de 2022?";
        questao7.opcoes[0] ="A - Brasil";
        questao7.opcoes[1] ="B - Portugal";
        questao7.opcoes[2] ="C - Alemanha";
        questao7.opcoes[3] ="D - Inglaterra";
        questao7.opcoes[4] ="E - França";
        questao7.questaoCorreta = "A";

        if (questao7.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }

        Questao questao8 = new Questao();
        questao8.pergunta ="8) Quem Ganhou a copa do Mundo de 2006?";
        questao8.opcoes[0] ="A - Itália ";
        questao8.opcoes[1] ="B - Brasil";
        questao8.opcoes[2] ="C - França";
        questao8.opcoes[3] ="D - Espanha";
        questao8.opcoes[4] ="E - Uruguai";
        questao8.questaoCorreta = "A";

        if (questao8.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao9 = new Questao();
        questao9.pergunta ="9) Quem é o Rei do futebol?";
        questao9.opcoes[0] ="A - Rivaldo ";
        questao9.opcoes[1] ="B - Ronaldo";
        questao9.opcoes[2] ="C - Pelé";
        questao9.opcoes[3] ="D - Zico";
        questao9.opcoes[4] ="E - Maradona";
        questao9.questaoCorreta = "C";

        if (questao9.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao10 = new Questao();
        questao10.pergunta ="10) Qual time possui mais champions?";
        questao10.opcoes[0] ="A - Milan";
        questao10.opcoes[1] ="B - Real Madrid";
        questao10.opcoes[2] ="C - Barcelona";
        questao10.opcoes[3] ="D - Liverpool";
        questao10.opcoes[4] ="E - Juventos";
        questao10.questaoCorreta = "B";

        if (questao10.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao11 = new Questao();
        questao11.pergunta ="11) Qual time foi campeão Brasileiro de 2015?";
        questao11.opcoes[0] ="A - Corinthians ";
        questao11.opcoes[1] ="B - Vasco ";
        questao11.opcoes[2] ="C - Flamengo";
        questao11.opcoes[3] ="D - Gremio";
        questao11.opcoes[4] ="E - Santos";
        questao11.questaoCorreta = "A";

        if (questao11.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }

        Questao questao12 = new Questao();
        questao12.pergunta ="12) Qual o maior Cltube do mundo?";
        questao12.opcoes[0] ="A - River Plate";
        questao12.opcoes[1] ="B - Barcelona";
        questao12.opcoes[2] ="C - PSG";
        questao12.opcoes[3] ="D - Manchester City";
        questao12.opcoes[4] ="E - Real Madrid";
        questao12.questaoCorreta = "E";

        if (questao12.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }

        Questao questao13 = new Questao();
        questao13.pergunta ="13) Qual desses nunca foi campeão da Champions League?";
        questao13.opcoes[0] ="A -Milan ";
        questao13.opcoes[1] ="B -Atletico de Madrid ";
        questao13.opcoes[2] ="C -Porto ";
        questao13.opcoes[3] ="D -Barcelona ";
        questao13.opcoes[4] ="E -Liverpool";
        questao13.questaoCorreta = "B";

        if (questao13.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }


        Questao questao14= new Questao();
        questao14.pergunta ="14) Qual time ganhou a libertadores de 2023?";
        questao14.opcoes[0] ="A - Flamengo ";
        questao14.opcoes[1] ="B - Boca Juniors ";
        questao14.opcoes[2] ="C - Fluminense ";
        questao14.opcoes[3] ="D - Palmeiras ";
        questao14.opcoes[4] ="E - River Plate ";
        questao14.questaoCorreta = "C";

        if (questao14.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }

        Questao questao15 = new Questao();
        questao15.pergunta ="15) Qual time foi campeão mundial de 2012";
        questao15.opcoes[0] ="A - Chealsea";
        questao15.opcoes[1] ="B - Real Madrid";
        questao15.opcoes[2] ="C - Flamnego";
        questao15.opcoes[3] ="D - Palmeiras";
        questao15.opcoes[4] ="E - Coritnhians";
        questao15.questaoCorreta = "E";

        if (questao15.realizarPerguntaValidarResposta()) {
            acertos++;
        } else {
            erros++;
        }

        if(acertos<6){
            System.out.printf("Seu desempenho foi RUIM, voce acertou %d perguntas e errou %d! ", acertos , erros);
        } else if (acertos<11) {
            System.out.printf("Seu desempenho foi MEDIANO, voce acertou %d perguntas e errou %d! ", acertos , erros);
        }else if (acertos<15) {
            System.out.printf("Seu desempenho foi BOM, voce acertou %d perguntas e errou %d! ", acertos, erros);
        }else {
            System.out.printf("Seu desempenho foi OTIMO, voce acertou %d perguntas e errou %d! ", acertos , erros);
        }
    }
}