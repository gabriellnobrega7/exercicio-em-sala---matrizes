import java.util.Scanner;

public class exercicio5 {
    
    public static Scanner input = new Scanner(System.in);


    public static void localizarMatriz(int[][] m){

         for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da  matriz: [" + i + "]" + "[" + j + "]" );
                m[i][j] = input.nextInt();
            }
            
        }

    }

    public static void buscaSequencial(int[][] m, int key){
        int cont = 0;
        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                if(m[i][j] == key){
                    System.out.println("Encontrado na linha: " + i + " coluna: " + j) ;
                    cont++;
                }
                
            }
        }
        if(cont == 0){
            System.out.println("Valor não encontrado na matriz");
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
        


        localizarMatriz(matriz);
        System.out.println("Digite o valor Key: ");
        int key = input.nextInt();
        buscaSequencial(matriz, key);
        System.out.println();
        System.out.println("Matriz abaixo: ");

        imprimirMatriz(matriz);

    }
}
