/* */
import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] respostas = new char[5][10]; 
        char[] gabarito = new char[10];       
        int[] resultado = new int[5];         

        
        System.out.println("Digite o gabarito das 10 questões (a, b, c ou d):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = input.next().toLowerCase().charAt(0);
        }

        System.out.println();

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as respostas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.print("Questão " + (j + 1) + ": ");
                respostas[i][j] = input.next().toLowerCase().charAt(0);
            }
            System.out.println();
        }

        
        for (int i = 0; i < 5; i++) {
            int acertos = 0;
            for (int j = 0; j < 10; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    acertos++;
                }
            }
            resultado[i] = acertos;
        }

       
        System.out.println("\n===== RESULTADOS =====");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + resultado[i] + " acertos");
        }

        input.close();
    }
}

