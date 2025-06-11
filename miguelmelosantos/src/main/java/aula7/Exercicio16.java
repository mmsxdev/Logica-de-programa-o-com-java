package aula7;

import java.util.Scanner;

public class Exercicio16{

    /**
     * Verifica se três números são consecutivos usando um array e ordenação manual.
     * @param a Primeiro inteiro.
     * @param b Segundo inteiro.
     * @param c Terceiro inteiro.
     * @return true se forem consecutivos, false caso contrário.
     */
    public static boolean saoConsecutivos(int a, int b, int c) {
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
        return (numeros[1] == numeros[0] + 1) && (numeros[2] == numeros[1] + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.println("Verifique se os três números mencionados são consecutivos ou não:");
        System.out.println(saoConsecutivos(num1, num2, num3));

        scanner.close();
    }
}