import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        if (soma == n) {
            System.out.println(n + " é um número perfeito.");
        } else {
            System.out.println(n + " não é um número perfeito.");
        }
    }
}
