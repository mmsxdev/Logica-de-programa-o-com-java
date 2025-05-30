package aula4;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int linhas = 4;
        int colunas = 4;
        // Declaração de matriz m[linhas][colunas] [cite: 95]
        int[][] matriz = new int[linhas][colunas];
        int contadorMaioresQue10 = 0;

        System.out.println("Digite os elementos da matriz 4x4:");
        // Laços aninhados para percorrer a matriz [cite: 113]
        for (int i = 0; i < linhas; i++) { // Percorre as linhas
            // System.out.printf("Informe os elementos %da. linha:\n", (i+1)); // Como no exemplo do PDF [cite: 113]
            for (int j = 0; j < colunas; j++) { // Percorre as colunas
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt(); // Leitura do elemento m[i][j] [cite: 114]
                if (matriz[i][j] > 10) {
                    contadorMaioresQue10++;
                }
            }
        }

        System.out.println("\nA matriz possui " + contadorMaioresQue10 + " valor(es) maior(es) que 10.");

        // Opcional: Imprimir a matriz para conferência
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t"); // "\t" para tabular
            }
            System.out.println(); // Pula linha ao final de cada linha da matriz
        }
        ler.close();
    }
}
