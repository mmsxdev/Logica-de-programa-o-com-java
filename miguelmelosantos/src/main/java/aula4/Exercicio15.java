package aula4;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 5;
        int[][] matriz = new int[tamanho][tamanho];
        boolean encontrado = false;
        int linhaEncontrado = -1;
        int colunaEncontrado = -1;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.print("\nDigite o valor X a ser buscado na matriz: ");
        int valorX = ler.nextInt();

        // Buscando o valor X na matriz
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (matriz[i][j] == valorX) {
                    encontrado = true;
                    linhaEncontrado = i;
                    colunaEncontrado = j;
                    break; // Interrompe o laço interno, pois já encontrou
                }
            }
            if (encontrado) {
                break; // Interrompe o laço externo também
            }
        }

        if (encontrado) {
            System.out.println("Valor " + valorX + " encontrado na posição (linha, coluna): ("
                    + linhaEncontrado + ", " + colunaEncontrado + ")");
        } else {
            System.out.println("Valor " + valorX + " não encontrado na matriz.");
        }
        ler.close();
    }
}
