package aula4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] vetor = new int[tamanho];

        System.out.println("Digite os 10 números inteiros do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = ler.nextInt();
        }

        // Imprimir o vetor
        System.out.print("\nVetor lido: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Encontrar o maior elemento e sua posição
        int maior = vetor[0];
        int posicaoMaior = 0; // Armazena o índice do maior elemento

        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i; // Atualiza a posição do maior
            }
        }

        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição (índice) do maior elemento: " + posicaoMaior);
        ler.close();
    }
}
