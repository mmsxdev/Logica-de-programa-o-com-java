package aula4;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];
        int somaAcimaDiagonal = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }

        // Calculando a soma dos elementos acima da diagonal principal
        // Elementos acima da diagonal principal são aqueles onde o índice da coluna (j)
        // é maior que o índice da linha (i).
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j > i) { // Condição para estar acima da diagonal principal
                    somaAcimaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma dos elementos acima da diagonal principal: " + somaAcimaDiagonal);

        // Opcional: Imprimir a matriz para conferência
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        ler.close();
    }
}
