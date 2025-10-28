/*Gere matriz4x4 com valores nointervalo[1,20]. Escreva um programa que transforme
 a matriz gerada numa matriz triangular inferior, ouseja, atribuindo zero a todos os ele
mentos acima da diagonal principal. Imprima a matriz original e amatriz transformada. */

import java.util.Scanner;

public class exercicio13 {

    public static Scanner input = new Scanner(System.in);


    public static void localizarMatriz(int[][] m){

       for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da matriz [" + i + "]" + "[" + j + "]");
                m[i][j] = input.nextInt();
            }
        }
    }

     public static void transformar(int[][] m){
        
        for(int i = 0; i < m.length; i++){
            
            for(int j = 0; j < m[i].length; j++){
                
                if(i < j){
                    m[i][j] = 0;

                }
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



    public static void main(String[] args) {
        

        int[][] matriz = new int[4][4];
        localizarMatriz(matriz);

        transformar(matriz);
        imprimirMatriz(matriz);

    }

}
