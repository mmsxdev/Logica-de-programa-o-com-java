package aula7;

import java.util.Scanner;

public class Exercicio7 {
    public static void imprimirCaracteres(char inicio, char fim) {
            int contador = 0;

            for (char c = inicio; c <= fim; c++) {
                System.out.print(c + " ");
                contador++;

                // Quebra de linha a cada 20 caracteres
                if (contador % 20 == 0) {
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira caracter: ");
        String inicio = scanner.next();

        System.out.println("Digite a segunda caracter: ");
        String fim = scanner.next();

        char inicioChar = inicio.charAt(0);
        char fimChar = fim.charAt(0);

        imprimirCaracteres(inicioChar, fimChar);
    }
}
