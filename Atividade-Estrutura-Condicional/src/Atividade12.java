import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma figura:");
        System.out.println("1. Cone Reto");
        System.out.println("2. Cilindro");
        System.out.println("3. Esfera");

        int opcao;
        while (true) {
            try {
                opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 3) {
                    break;
                } else {
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpar a entrada inválida
            }
        }

        switch (opcao) {
            case 1:
                calcularCone(scanner);
                break;
            case 2:
                calcularCilindro(scanner);
                break;
            case 3:
                calcularEsfera(scanner);
                break;
        }

        scanner.close();
    }

    private static void calcularCone(Scanner scanner) {
        System.out.print("Raio do cone: ");
        double r = lerDouble(scanner);
        System.out.print("Altura do cone: ");
        double h = lerDouble(scanner);

        double volume = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
        double areaSuperficie = Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));

        System.out.printf("Volume do cone: %.2f m³%n", volume);
        System.out.printf("Área da superfície do cone: %.2f m²%n", areaSuperficie);
    }

    private static void calcularCilindro(Scanner scanner) {
        System.out.print("Raio do cilindro: ");
        double r = lerDouble(scanner);
        System.out.print("Altura do cilindro: ");
        double h = lerDouble(scanner);

        double volume = Math.PI * Math.pow(r, 2) * h;
        double areaSuperficie = 2 * Math.PI * r * (r + h);

        System.out.printf("Volume do cilindro: %.2f m³%n", volume);
        System.out.printf("Área da superfície do cilindro: %.2f m²%n", areaSuperficie);
    }

    private static void calcularEsfera(Scanner scanner) {
        System.out.print("Raio da esfera: ");
        double r = lerDouble(scanner);

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double areaSuperficie = 4 * Math.PI * Math.pow(r, 2);

        System.out.printf("Volume da esfera: %.2f m³%n", volume);
        System.out.printf("Área da superfície da esfera: %.2f m²%n", areaSuperficie);
    }

    private static double lerDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpar a entrada inválida
            }
        }
    }
}
