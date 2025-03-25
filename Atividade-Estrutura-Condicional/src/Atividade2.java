/*
01 - Fazer um algoritmo que calcule a média aritmética das 3 notas de um aluno e mostre, além do valor da média do aluno, uma
mensagem de "Aprovado", caso a média seja igual ou superior a 6, ou a mensagem "reprovado", caso contrário.
*/

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3;
        System.out.println("Digite a nota 1: ");
        nota1 = input.nextInt();

        System.out.println("Digite a nota 1: ");
        nota2 = input.nextInt();

        System.out.println("Digite a nota 1: ");
        nota3 = input.nextInt();

        float media = (float) (nota1 + nota2 + nota3) /3;

        if (media >= 6) {
            System.out.println("Sua média foi de: " + media+ "\nVocê foi Aprovado!");
        } else {
            System.out.println("Sua média foi de: " + media+ "\nVocê foi Reprovado!");
        }
    }
}
