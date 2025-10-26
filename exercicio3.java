  /*Faca um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
 coluna de cada elemento. Em seguida, imprima na tela a matriz. */

public class exercicio3 {


     public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

               m[i][j] = i * j;
                
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

        System.out.println("Matriz: ");

        localizarMatriz(matriz);
        imprimirMatriz(matriz);

    }
    
}
