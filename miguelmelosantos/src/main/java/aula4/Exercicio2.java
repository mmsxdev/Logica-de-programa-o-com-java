package aula4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero "+ i +": ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Os numeros digitados foram: "+vetor[i]);
        }
    }
}
