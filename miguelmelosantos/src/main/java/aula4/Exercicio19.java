package aula4;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];
        int somaAbaixoDiagonal = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }

        // Calculando a soma dos elementos abaixo da diagonal principal
        // Elementos abaixo da diagonal principal são aqueles onde o índice da linha (i)
        // é maior que o índice da coluna (j).
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i > j) { // Condição para estar abaixo da diagonal principal
                    somaAbaixoDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma dos elementos abaixo da diagonal principal: " + somaAbaixoDiagonal);

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
