package aula4;

public class Exercicio17 {
    public static void main(String[] args) {
        int tamanho = 10;
        // O PDF não especifica o tipo da matriz, mas pelas operações (potenciação),
        // os resultados podem ser grandes. Usarei int, mas double poderia ser mais seguro
        // se os valores ficassem muito grandes. Para i, j < 10, int deve ser suficiente.
        int[][] A = new int[tamanho][tamanho];

        // Gerando a matriz A
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i < j) {
                    A[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    // Para i*i (i ao quadrado)
                    A[i][j] = 3 * (i * i) - 1;
                } else { // i > j
                    // Para i*i*i (i ao cubo) e j*j (j ao quadrado)
                    A[i][j] = 4 * (i * i * i) - 5 * (j * j) + 1;
                }
            }
        }

        // Imprimindo a matriz A
        System.out.println("Matriz A (10x10) gerada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("%5d ", A[i][j]); // Formatando para alinhar melhor
            }
            System.out.println();
        }
    }
}
