
package Becrowd26_05_2025;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] A = new double[100];

        for (int i = 0; i < 100; i++) {
            A[i] = sc.nextDouble();
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10.0) {
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }

        sc.close();
    }
}