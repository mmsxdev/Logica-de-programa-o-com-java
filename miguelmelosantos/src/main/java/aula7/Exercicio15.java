package aula7;

import java.util.Scanner;

public class Exercicio15 {

    /**
     * Conta a ocorrência do dígito 2 em um inteiro.
     * @param n O número inteiro não negativo.
     * @return O número de vezes que o dígito 2 aparece.
     */
    public static int contarDigitoDois(int n) {
        String str = String.valueOf(n);
        int contagem = 0;
        for (char c : str.toCharArray()) {
            if (c == '2') {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: "); // [cite: 40]
        int numero = scanner.nextInt();

        int resultado = contarDigitoDois(numero);
        System.out.println(resultado); // [cite: 40]

        scanner.close();
    }
}
