import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();         // coluna escolhida
        char T = sc.next().charAt(0); // operação: 'S' ou 'M'

        double[][] M = new double[12][12];

        // Leitura da matriz 12x12
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        // Soma todos os elementos da coluna C
        for (int i = 0; i < 12; i++) {
            soma += M[i][C];
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