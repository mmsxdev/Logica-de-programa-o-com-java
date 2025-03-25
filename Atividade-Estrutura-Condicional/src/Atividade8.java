import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        double A = scanner.nextDouble();

        System.out.println("Digite o lado B:");
        double B = scanner.nextDouble();

        System.out.println("Digite o lado C:");
        double C = scanner.nextDouble();

        // Verifica se os lados formam um triângulo
        if (ehTriangulo(A, B, C)) {
            System.out.println("Os lados formam um triângulo.");

            // Classifica o triângulo
            classificaTriangulo(A, B, C);
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        scanner.close();
    }

    // Método para verificar se os lados formam um triângulo
    public static boolean ehTriangulo(double A, double B, double C) {
        return (A + B > C) && (A + C > B) && (B + C > A);
    }

    // Método para classificar o triângulo
    public static void classificaTriangulo(double A, double B, double C) {
        double[] lados = {A, B, C};
        double maior = Math.max(Math.max(A, B), C);
        double somaDosOutros = A + B + C - maior;

        if (Math.pow(maior, 2) == Math.pow(somaDosOutros, 2)) {
            System.out.println("O triângulo é retângulo.");
        } else if (Math.pow(maior, 2) > Math.pow(somaDosOutros, 2)) {
            System.out.println("O triângulo é obtusângulo.");
        } else {
            System.out.println("O triângulo é acutângulo.");
        }
    }
}
