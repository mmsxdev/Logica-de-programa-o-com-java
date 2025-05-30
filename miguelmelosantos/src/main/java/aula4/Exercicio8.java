package aula4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 6;
        int[] valores = new int[tamanho];

        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe o %do. valor: ", (i + 1));
            valores[i] = ler.nextInt();
        }

        System.out.println("\nValores lidos na ordem inversa:");
        // Para imprimir na ordem inversa, começamos do último elemento e vamos até o primeiro
        for (int i = tamanho - 1; i >= 0; i--) { // O último índice é tamanho - 1 [cite: 42]
            System.out.println(valores[i]);
        }
        ler.close();
    }
}
