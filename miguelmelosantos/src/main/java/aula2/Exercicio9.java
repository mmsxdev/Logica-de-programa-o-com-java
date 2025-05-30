package aula2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercício 9
        System.out.print("Lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("Lado 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("Lado 3: ");
        int lado3 = scanner.nextInt();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
        scanner.close();
    }
}
