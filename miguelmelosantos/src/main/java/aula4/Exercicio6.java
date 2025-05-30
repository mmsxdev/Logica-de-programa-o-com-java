package aula4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] vetor = new int[tamanho];

        System.out.println("Digite os 10 valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = ler.nextInt();
        }

        // Encontrar o maior e o menor elemento
        // Inicializa o maior e o menor com o primeiro elemento do vetor [cite: 59]
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < tamanho; i++) { // Começa do segundo elemento (índice 1)
            if (vetor[i] > maior) {
                maior = vetor[i]; // Atualiza o maior [cite: 59]
            }
            if (vetor[i] < menor) {
                menor = vetor[i]; // Atualiza o menor [cite: 59]
            }
        }

        System.out.println("\nMaior elemento do vetor: " + maior);
        System.out.println("Menor elemento do vetor: " + menor);
        ler.close();
    }
}
