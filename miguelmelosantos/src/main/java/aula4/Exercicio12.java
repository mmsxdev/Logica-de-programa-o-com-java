package aula4;

public class Exercicio12 {
    public static void main(String[] args) {
        int tamanho = 5;
        int[][] matriz = new int[tamanho][tamanho]; // Matriz quadrada 5x5 [cite: 98]

        // Preenchendo a matriz
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) { // Elementos da diagonal principal têm índice de linha igual ao de coluna [cite: 28]
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Escrevendo a matriz obtida
        System.out.println("Matriz obtida:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
