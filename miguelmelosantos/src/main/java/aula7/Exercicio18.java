package aula7;

import java.util.Scanner;

public class Exercicio18 {

    /**
     * Extrai o primeiro dígito de um inteiro.
     * @param n O inteiro (positivo ou negativo).
     * @return O primeiro dígito do número.
     */
    public static int extrairPrimeiroDigito(int n) {
        long num = Math.abs((long)n); // Usa long para evitar overflow com Integer.MIN_VALUE
        while (num >= 10) {
            num /= 10;
        }
        return (int)num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um inteiro (positivo/negativo): "); // [cite: 46]
        int numero = scanner.nextInt();

        System.out.println("Extraia o primeiro dígito do número inteiro mencionado:");
        System.out.println(extrairPrimeiroDigito(numero)); // [cite: 46]
        scanner.close();
    }
}