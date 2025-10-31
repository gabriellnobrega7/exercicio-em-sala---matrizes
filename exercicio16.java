import java.util.Scanner;

public class exercicio16 {

    public static Scanner input = new Scanner(System.in);

    // Função para ler o gabarito com validação
    public static String[] preencherProva() {
        String[] gabarito = new String[10];
        System.out.println("Digite o gabarito (uma letra por linha — a, b, c, d ou e):");

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Questão " + (i + 1) + ": ");
                String letra = input.nextLine();

                if (letra.equals("a") || letra.equals("b") || letra.equals("c") || letra.equals("d") || letra.equals("e")) {
                    gabarito[i] = letra;
                    break;
                } else {
                    System.out.println("Letra inválida! Digite apenas a, b, c, d ou e.");
                }
            }
        }
        return gabarito;
    }

    public static void main(String[] args) {
        String[] gabarito = preencherProva();

        System.out.print("\nDigite a quantidade de alunos: ");
        int totalAlunos = input.nextInt();
        input.nextLine(); // consumir quebra de linha

        int aprovados = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("\nAluno " + i);
            System.out.print("Matrícula: ");
            int matricula = input.nextInt();
            input.nextLine(); // consumir quebra de linha

            String[] respostas = new String[10];
            System.out.println("Digite as respostas (uma letra por linha — a, b, c, d ou e):");

            for (int j = 0; j < 10; j++) {
                while (true) {
                    System.out.print("Questão " + (j + 1) + ": ");
                    String letra = input.nextLine();

                    if (letra.equals("a") || letra.equals("b") || letra.equals("c") || letra.equals("d") || letra.equals("e")) {
                        respostas[j] = letra;
                        break;
                    } else {
                        System.out.println("Letra inválida! Digite apenas a, b, c, d ou e.");
                    }
                }
            }

            int nota = 0;
            for (int j = 0; j < 10; j++) {
                if (respostas[j].equals(gabarito[j])) {
                    nota++;
                }
            }

            System.out.println("Matrícula: " + matricula);
            System.out.println("Nota: " + nota);

            if (nota >= 7) {
                aprovados++;
            }
        }

        double percentualAprovacao = (aprovados * 100.0) / totalAlunos;
        System.out.println("\nPercentual de aprovação: " + percentualAprovacao + "%");
    }
}
