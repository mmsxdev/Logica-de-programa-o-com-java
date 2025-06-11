package aula7;

import java.util.Scanner;

public class Exercicio20 {

    /**
     * Verifica se todos os dígitos de um inteiro são pares.
     * @param n O inteiro a ser verificado.
     * @return true se todos os dígitos forem pares, false caso contrário.
     */
    public static boolean todosDigitosPares(int n) {
        int num = Math.abs(n);

        if(num == 0) return true; // 0 é considerado par

        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                return false; // Encontrou um dígito ímpar
            }
            num /= 10;
        }
        return true; // Nenhum dígito ímpar encontrado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um inteiro: "); // [cite: 51]
        int numero = scanner.nextInt();

        System.out.println("Verifique se todos os dígitos do número inteiro são pares ou não:");
        System.out.println(todosDigitosPares(numero)); // [cite: 51]
        scanner.close();
    }
}