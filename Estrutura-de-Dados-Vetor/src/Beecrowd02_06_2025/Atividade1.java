import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();        // linha escolhida
        char T = sc.next().charAt(0); // operação: 'S' ou 'M'

        double[][] M = new double[12][12];

        // Leitura da matriz 12x12
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        // Soma todos os elementos da linha L
        for (int j = 0; j < 12; j++) {
            soma += M[L][j];
        }

        if (T == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (T == 'M') {
            double media = soma / 12.0;
            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}