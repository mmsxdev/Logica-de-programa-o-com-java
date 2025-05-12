import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int primeiro = 0, segundo = 1;

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                System.out.print(primeiro);
            } else if (i == 1) {
                System.out.print(" " + segundo);
            } else {
                int proximo = primeiro + segundo;
                System.out.print(" " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }
        }

        System.out.println();
        sc.close();
    }
}
