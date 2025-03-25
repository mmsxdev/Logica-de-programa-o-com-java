import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de consumidor (residencial, comercial, industrial):");
        String tipo = scanner.next().toLowerCase();

        System.out.println("Digite o consumo de água em metros cúbicos:");
        double consumo = scanner.nextDouble();

        double valor = calculaConta(tipo, consumo);

        System.out.println("Conta do cliente: " + tipo);
        System.out.println("Valor a ser pago: R$ " + String.format("%.2f", valor));

        scanner.close();
    }

    // Método para calcular a conta de água
    public static double calculaConta(String tipo, double consumo) {
        switch (tipo) {
            case "residencial":
                return 5.00 + (consumo * 0.05);
            case "comercial":
                return (consumo <= 80) ? 500.00 : 500.00 + ((consumo - 80) * 0.25);
            case "industrial":
                return (consumo <= 100) ? 800.00 : 800.00 + ((consumo - 100) * 0.04);
            default:
                System.out.println("Tipo de consumidor inválido.");
                return 0.0;
        }
    }
}
