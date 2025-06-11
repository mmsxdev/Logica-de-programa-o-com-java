package aula7;

import java.util.Scanner;

public class Exercicio19 {

    /**
     * Exibe os fatores de 3 de um inteiro.
     * @param n O inteiro a ser fatorado.
     */
    public static void exibirFatoresDeTres(int n) {
        int original = n;
        if (n == 0) {
            System.out.println("0 não pode ser fatorado.");
            return;
        }

        System.out.print(original + " = ");

        int restante = n;
        String fatores = "";

        while (restante % 3 == 0) {
            fatores += "3*";
            restante /= 3;
        }

        fatores += restante;

        System.out.println(fatores);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um inteiro (positivo/negativo): "); // [cite: 48]
        int numero = scanner.nextInt();

        System.out.println("Fatores de 3 do referido inteiro:");
        exibirFatoresDeTres(numero);
        scanner.close();
    }
}