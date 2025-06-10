package Becrowd26_05_2025;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pré-calcula os números de Fibonacci até N=60
        // Usamos long pois os valores podem crescer bastante
        long[] fib = new long[61];
        fib[0] = 0;
        if (fib.length > 1) { // Garante que o array tem tamanho suficiente para fib[1]
            fib[1] = 1;
        }

        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Lê o número de casos de teste
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            // Lê o valor de N para cada caso de teste
            int N = sc.nextInt();
            // Imprime o resultado no formato especificado
            System.out.printf("Fib(%d) = %d\n", N, fib[N]);
        }

        sc.close();
    }
}