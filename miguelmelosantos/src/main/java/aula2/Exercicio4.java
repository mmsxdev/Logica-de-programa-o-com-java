package aula2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = (int) scanner.nextDouble();
        System.out.print("Digite o valor de y: ");
        int y = (int) scanner.nextDouble();
        System.out.print("Digite o valor de z: ");
        double z = scanner.nextDouble();
        int resultado = (int) ((x * y) / z);
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
