import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char O = sc.next().charAt(0);  // Operação 'S' ou 'M'

        double[][] M = new double[12][12];

        // Lê a matriz 12x12
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        int count = 0;

        // Percorre elementos abaixo da diagonal principal (i > j)
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                soma += M[i][j];
                count++;
            }
        }

        if (O == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (O == 'M') {
            double media = soma / count;
            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}