package aula7;

import java.util.Scanner;

public class Exercicio11 {

    /**
     * Calcula a área de um triângulo usando a fórmula de Heron.
     * @param lado1 Comprimento do primeiro lado.
     * @param lado2 Comprimento do segundo lado.
     * @param lado3 Comprimento do terceiro lado.
     * @return A área do triângulo.
     */
    public static double calcularAreaTriangulo(double lado1, double lado2, double lado3) {
        // Calcula o semi-perímetro
        double s = (lado1 + lado2 + lado3) / 2;

        // Calcula a área usando a fórmula de Heron
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado de entrada 1: "); // [cite: 33]
        double lado1 = scanner.nextDouble();

        System.out.print("Lado de entrada 2: "); // [cite: 33]
        double lado2 = scanner.nextDouble();

        System.out.print("Lado de entrada 3: "); // [cite: 33]
        double lado3 = scanner.nextDouble();

        double area = calcularAreaTriangulo(lado1, lado2, lado3);

        System.out.println("A área do triângulo é " + area); // [cite: 33]

        scanner.close();
    }
}