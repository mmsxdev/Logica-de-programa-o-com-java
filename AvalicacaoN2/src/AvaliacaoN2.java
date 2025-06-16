import java.util.Scanner;

public class AvaliacaoN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int contador = 1;

        for (int i = 0; i < N; i++) {
            System.out.printf("%d %d %d PUM\n", contador, contador + 1, contador + 2);
            contador += 4;
        }

        sc.close();
    }
}