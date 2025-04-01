import java.util.Scanner;

public class CalculoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double preco = switch (codigo) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 0.0;
        };

        double total = preco * quantidade;
        System.out.printf("Total: R$ %.2f%n", total);
    }
}