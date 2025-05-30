package aula4;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 4;
        int[][] matrizA = new int[tamanho][tamanho];
        int[][] matrizB = new int[tamanho][tamanho];
        int[][] matrizC = new int[tamanho][tamanho]; // Terceira matriz

        System.out.println("Digite os elementos da Matriz A (4x4):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("MatrizA[%d][%d]: ", i, j);
                matrizA[i][j] = ler.nextInt();
            }
        }

        System.out.println("\nDigite os elementos da Matriz B (4x4):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("MatrizB[%d][%d]: ", i, j);
                matrizB[i][j] = ler.nextInt();
            }
        }

        // Gerando a Matriz C com os maiores valores de cada posição
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matrizA[i][j] > matrizB[i][j]) {
                    matrizC[i][j] = matrizA[i][j];
                } else {
                    matrizC[i][j] = matrizB[i][j];
                }
                // Alternativa usando Math.max:
                // matrizC[i][j] = Math.max(matrizA[i][j], matrizB[i][j]);
            }
        }

        System.out.println("\nMatriz C (com os maiores valores de cada posição de A e B):");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
        ler.close();
    }
}
