package QuizBrenno;
import java. util. Arrays;
import java.util.Scanner;

public class Questao {
    String pergunta;
    String[] opcoes = new String[5];
    String questaoCorreta;

    public boolean realizarPerguntaValidarResposta() {
        Scanner ler = new Scanner(System.in);

        System.out.println();
        System.out.println("______________________________________________________________");
        System.out.println("Pergunta: "+this.pergunta);
        for (String opcao : this.opcoes) {
            System.out.println(" " + opcao);
        }
        System.out.println();
        System.out.print("Resposta: ");
        String respostaUsuario = ler.next();

        return this.corrigirResposta(respostaUsuario);
    }
    private boolean corrigirResposta(String respostaUser) {
        if (respostaUser.equalsIgnoreCase(this.questaoCorreta)) {
            System.out.println("A sua resposta está CORRETA! ");
            return true;
        }
        System.out.println("A sua resposta está ERRADA! ");
        System.out.println("A Resposta correta é: " + this.questaoCorreta);
        return false;
    }

}

