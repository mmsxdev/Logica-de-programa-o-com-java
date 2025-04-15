import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número n: ");
        int n = sc.nextInt();
        long produto = 1;

        for (int i = 1; i <= n; i++) {
            produto *= i;
        }

        System.out.println("Produtório de 1 a " + n + " é: " + produto);
    }
}
