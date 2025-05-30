package aula4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] vetor = new int[tamanho];
        int contadorPares = 0;

        System.out.println("Digite os 10 valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = ler.nextInt();
        }

        // Contar valores pares
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) { // Verifica se o número é par (resto da divisão por 2 é 0)
                contadorPares++;
            }
        }

        System.out.println("\nO vetor possui " + contadorPares + " valor(es) par(es).");
        ler.close();
    }
}
