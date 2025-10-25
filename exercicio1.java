 
import java.util.Scanner;

 public class exercicio1{

    public static Scanner input = new Scanner(System.in);

    public static void localizarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                System.out.println("Digite o número da  matriz: [" + i + "]" + "[" + j + "]" );
                m[i][j] = input.nextInt();
            }
            
        }
    }

    public static void imprimirValoresmaioresque10(int[][] m){

        int cont = 0;

        for(int i = 0; i < m.length; i++){

            for(int j = 0; j < m[i].length; j++){

                
                if(m[i][j] > 10){
                    cont++;
                    
                }

            }
            
        }
        System.out.println("Quantidade de valores maiores que 10: " + cont);
    }

    public static void main(String[] args) {
        
        int[][] m = new int[4][4];


        localizarMatriz(m);
        imprimirValoresmaioresque10(m);

    }

 }