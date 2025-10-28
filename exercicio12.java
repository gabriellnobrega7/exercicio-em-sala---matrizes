/* Leia uma matriz de 3x3 elementos. Calcule e imprima a sua transposta. */

import java.util.Scanner;

public class exercicio12 {
    
    public static Scanner input = new Scanner(System.in);

    public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da matriz [" + i + "]" + "[" + j + "]");
                m[i][j] = input.nextInt();
            }
        }

    }

    public static void transporMatriz(int[][] m){

        int aux;
        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                if(i<j){

                    aux = m[i][j];
                    m[i][j] = m[j][i];
                    m[j][i] = aux;
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
        
        int[][] matriz = new int[3][3];

        localizarMatriz(matriz);
        System.out.println();
        transporMatriz(matriz);
        System.out.println("Matriz Transposta: ");
        imprimirMatriz(matriz);


    }


}
