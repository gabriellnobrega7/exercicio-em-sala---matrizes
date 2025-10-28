/* . Leiaumamatrizde3x3elementos.Calculeasomadoselementosqueest˜ aonadiago
nalsecund´ aria.*/


import java.util.Scanner;

public class exercicio11 {
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
                
                if(i == 2 && j == 0){
                    soma+= m[i][j];

                }
                else if(i == 1 && j == 1){
                    soma+= m[i][j];
                }
                 else if(i == 0 && j == 2){
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

