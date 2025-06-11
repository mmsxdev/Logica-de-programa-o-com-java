package aula7;

import java.util.Scanner;

public class Exercicio8 {
    public static boolean ehBisexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano: ");
        ano = scanner.nextInt();

        boolean resultado = ehBisexto(ano);
        System.out.println(resultado);
    }
}
