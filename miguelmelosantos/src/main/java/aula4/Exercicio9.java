package aula4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 6;
        int[] valoresPares = new int[tamanho];
        int contador = 0; // Contador para controlar o preenchimento do vetor

        System.out.println("Digite 6 valores inteiros PARES:");
        while (contador < tamanho) {
            System.out.printf("Informe o %do. valor PAR: ", (contador + 1));
            int valorLido = ler.nextInt();
            if (valorLido % 2 == 0) { // Verifica se é par
                valoresPares[contador] = valorLido;
                contador++;
            } else {
                System.out.println("Valor inválido. Por favor, digite um número PAR.");
            }
        }

        System.out.println("\nValores pares lidos na ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println(valoresPares[i]);
        }
        ler.close();
    }
}
