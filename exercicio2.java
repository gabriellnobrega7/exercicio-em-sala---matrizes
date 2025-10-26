 

public class exercicio2 {
    
    public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                if(i == j){

                    m[i][j] = 1;
                }

                else{
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
        
        int[][] matriz = new int[5][5];

        System.out.println(" Matriz Abaixo: ");

        localizarMatriz(matriz);
        imprimirMatriz(matriz);

    }
}
