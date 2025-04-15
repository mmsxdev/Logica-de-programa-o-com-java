import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        long n = input.nextLong();

        if (n <= 1) {
            System.out.println(n + " não é primo");
        } else {
            boolean isPrimo = true;

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(n + " é primo");
            } else {
                System.out.println(n + " não é primo");
            }
        }
    }
}
