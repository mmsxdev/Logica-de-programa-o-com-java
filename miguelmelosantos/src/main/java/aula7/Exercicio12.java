package aula7;

import java.util.Scanner;

public class Exercicio12 {

    /**
     * Calcula a área de um pentágono regular.
     * @param n O número de lados (deve ser 5).
     * @param lado O comprimento de um lado.
     * @return A área do pentágono.
     */
    public static double calcularAreaPentagono(int n, double lado) {
        if (n != 5) {
            return 0; // Retorna 0 se não for um pentágono
        }
        // Fórmula da área de um polígono regular
        return (n * lado * lado) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número de lados: "); // [cite: 35]
        int n = scanner.nextInt();

        System.out.print("Insira o lado: "); // [cite: 35]
        double lado = scanner.nextDouble();

        double area = calcularAreaPentagono(n, lado);

        System.out.println("A área do pentágono é " + area); // [cite: 35]

        scanner.close();
    }
}