package aula6.listaexercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static double menorNumeroDe3(double []vetor) {
        double menorNumero = vetor[0];

        for (double j : vetor) {
            if (menorNumero > j) {
                menorNumero = j;
            }
        }

        return menorNumero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double []vetor = new double[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor do vetor ["+ i +"]: ");
            vetor[i] = scanner.nextDouble();
        }
        double menor = menorNumeroDe3(vetor);
        System.out.println("O menor valor digitado foi o numero: " + menor);
    }
}
