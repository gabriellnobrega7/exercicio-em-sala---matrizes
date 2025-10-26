/* Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que est˜ ao na diago
nal principal */

import java.util.Scanner;

public class exercicio10 {
    public static Scanner input = new Scanner(System.in);

    public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da  matriz: [" + i + "]" + "[" + j + "]" );
                m[i][j] = input.nextInt();
            }
            
        }
    }

    public static int somar(int[][] m){
        int soma = 0;
        for(int i = 0; i < m.length; i++){
            
            for(int j = 0; j < m[i].length; j++){
                
                if(i == j){
                    soma+= m[i][j];

                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];

        localizarMatriz(matriz);

        int soma = somar(matriz);
        System.out.println();
        System.out.println("Soma total dos valores acima da D.P: " + soma);

    }
}



