import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        int notasValidas = 0;
        double soma = 0.0;

        while (notasValidas < 2) {
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;
        System.out.printf("media = %.2f\n", media);

        sc.close();
    }
}
