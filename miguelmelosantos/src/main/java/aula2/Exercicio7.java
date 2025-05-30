package aula2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println("Maior: " + A);
        } else if (B > A) {
            System.out.println("Maior: " + B);
        } else {
            System.out.println("Os valores são iguais");
        }

        scanner.close();
    }
}
