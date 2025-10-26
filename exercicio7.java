  
  /*Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos s˜ ao da forma:
 A[i][j] = 2i + 7j 2 se i < j;
 A[i][j] = 3i2 1 se i = j;
 A[i][j] = 4i3 5j2 +1 se i > 
   *
   */

  public class exercicio7{

    public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                if(i < j){
                    m[i][j] = (2*i) + (7*j) - 2;
                }
                else if(i > j){
                    m[i][j] = 4 * (i * i * i) - 5 * (j * j) + 1;

                }
                else{

                    m[i][j] = 3 * (i * i) - 1;
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
        

        int[][] matriz = new int[10][10];

        localizarMatriz(matriz);

        System.out.println();
        System.out.println("Matriz impressa: ");
        imprimirMatriz(matriz);

    }

  }
