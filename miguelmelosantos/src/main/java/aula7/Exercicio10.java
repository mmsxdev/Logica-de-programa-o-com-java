package aula7;

import java.util.Scanner;

public class Exercicio10 {

    // Méthod estático que exibe a matriz n x n com 0 e 1 aleatórios
    public static void exibirMatriz(int n) {
        for (int i = 0; i < n; i++) { // Linhas
            for (int j = 0; j < n; j++) { // Colunas
                int valor = (int) (Math.random() * 2); // Gera 0 ou 1
                System.out.print(valor + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = scanner.nextInt();

        exibirMatriz(n);

        scanner.close();
    }
}
