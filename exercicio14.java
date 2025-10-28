/* Fac¸aumprogramaparagerarautomaticamenten´umerosentre0e99deumacartelade
 bingo.Sabendoquecadacarteladever´ aconter5linhasde5n´umeros,gereestesdados
 demodoan˜ aotern´umerosrepetidosdentrodascartelas. Oprogramadeveexibirna
 telaacartelagerada */
public class exercicio14 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int[][] cartela = new int[5][5];

        for (int i = 0; i < 100; i++) {
            numeros[i] = i;
        }

        for (int i = 0; i < 100; i++) {
            int j = (i * 37 + 17) % 100; 
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }

        
        int indice = 0;
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                cartela[linha][coluna] = numeros[indice++];
            }
        }

        System.out.println("Cartela de Bingo:");
        for (int[] linha : cartela) {
            for (int num : linha) {
                System.out.printf("%02d ", num);
            }
            System.out.println();
        }
    }
}

