/* Leia uma matriz 4 x 4, imprima a matriz e retorne a localizac¸˜ ao (linha e a coluna) do
 maior valor. */


import java.util.Scanner;

public class exercicio4 {
    
    public static Scanner input = new Scanner(System.in);

    public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da  matriz: [" + i + "]" + "[" + j + "]" );
                m[i][j] = input.nextInt();
            }
            
        }

    }
    public static int maiorValor(int[][] m, int[] posicaoMaior) {
    int maior = 0;
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            if (i == 0 && j == 0) {
                maior = m[i][j];
                posicaoMaior[0] = i;
                posicaoMaior[1] = j;
            }
            else if(m[i][j] > maior){

                maior = m[i][j];
                posicaoMaior[0] = i;
                posicaoMaior[1] = j;

            }
        }
    }
    return maior;
}

    public static void imprimirMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

               System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        int[] posicaoMaior = new int[2];
        localizarMatriz(matriz);
        int maiorValor = maiorValor(matriz, posicaoMaior);
        
        System.out.println("Matriz digitada: ");
        imprimirMatriz(matriz);

        System.out.println();
        System.out.println("O maior valor foi : " + maiorValor + " Encontrado na linha " + posicaoMaior[0] + " coluna " + posicaoMaior[1]);
    }

}
