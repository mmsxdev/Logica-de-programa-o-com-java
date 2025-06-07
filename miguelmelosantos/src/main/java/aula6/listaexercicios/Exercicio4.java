package aula6.listaexercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static double mediaDeTresNumeros(double []vetor) {
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma / vetor.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double []vetor = new double[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor do vetor ["+ i +"]: ");
            vetor[i] = scanner.nextDouble();
        }
        double media = mediaDeTresNumeros(vetor);
        System.out.println("A média dos valores digitados é: " + media);
    }
}
