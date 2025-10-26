/* Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posic¸˜ ao
 das matrizes lidas. */
 
import java.util.Scanner;

public class exercicio6 {
    
    public static Scanner input = new Scanner(System.in);

     public static void localizarMatriz(int[][] m){

         for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da  matriz: [" + i + "]" + "[" + j + "]" );
                m[i][j] = input.nextInt();
            }
            
        }

    }

    
    public static void imprimirMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

               System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static int[][] matrizMaiorValor(int[][] m1, int[][] m2) {
        int[][] m3 = new int[4][4];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                // pega o maior valor de cada posição
                m3[i][j] = Math.max(m1[i][j], m2[i][j]);
            }
        }
        return m3;
    }

    public static void main(String[] args) {
        
        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        localizarMatriz(m1);
        System.out.println();
        localizarMatriz(m2);
        System.out.println();
        int[][] matriz3 = matrizMaiorValor(m1, m2);

        imprimirMatriz(m1);
        System.out.println();
        imprimirMatriz(m2);
        System.out.println();
        imprimirMatriz(matriz3);



    }

}
