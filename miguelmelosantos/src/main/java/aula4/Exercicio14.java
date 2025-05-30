package aula4;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrando o maior valor e sua localização
        int maiorValor = matriz[0][0]; // Inicializa com o primeiro elemento
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMaior valor encontrado: " + maiorValor);
        System.out.println("Localização (linha, coluna): (" + linhaMaior + ", " + colunaMaior + ")");
        ler.close();
    }
}
