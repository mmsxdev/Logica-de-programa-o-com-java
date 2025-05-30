package aula4;

public class Exercicio13 {
    public static void main(String[] args) {
        int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];

        // Preenchendo a matriz com o produto da linha pela coluna
        // (Considerando índices de 0 a 3. Se for o "valor" da linha/coluna como 1 a 4, seria (i+1)*(j+1))
        // O enunciado diz "valor da linha e da coluna", o que pode ser interpretado como os índices.
        // Vou usar os índices i e j diretamente.
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = i * j; // Produto dos índices
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz com produto (índice_linha * índice_coluna):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Se a interpretação for o "número" da linha/coluna (1-4):
        System.out.println("\nMatriz com produto ((linha+1) * (coluna+1)):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = (i+1) * (j+1);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
