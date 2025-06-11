package aula7;

import java.util.Scanner;

public class Exercicio17 {

    /**
     * Verifica se um número é o ponto médio entre outros dois usando um array e ordenação manual.
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     * @param c Terceiro inteiro.
     * @return true se um for o ponto médio, false caso contrário.
     */
    public static boolean temPontoMedio(int a, int b, int c) {
        int[] numeros = {a, b, c};

        // Ordenação manual simples (Bubble Sort para 3 elementos)
        if (numeros[0] > numeros[1]) {
            int temp = numeros[0];
            numeros[0] = numeros[1];
            numeros[1] = temp;
        }
        if (numeros[1] > numeros[2]) {
            int temp = numeros[1];
            numeros[1] = numeros[2];
            numeros[2] = temp;
        }
        if (numeros[0] > numeros[1]) {
            int temp = numeros[0];
            numeros[0] = numeros[1];
            numeros[1] = temp;
        }

        // Com o array ordenado, a verificação é direta
        // numeros[0] é o mínimo, numeros[1] é o meio, numeros[2] é o máximo
        return (numeros[0] + numeros[2]) == (2 * numeros[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.println("Verifique se os três números mencionados têm um ponto médio:");
        System.out.println(temPontoMedio(num1, num2, num3));

        scanner.close();
    }
}