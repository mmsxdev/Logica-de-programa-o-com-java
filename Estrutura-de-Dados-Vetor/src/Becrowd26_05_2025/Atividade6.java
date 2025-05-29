package Becrowd26_05_2025;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] N = new int[1000];

        for (int i = 0; i < 1000; i++) {
            N[i] = i % T;
        }

        for (int i = 0; i < 1000; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }

        sc.close();
    }
}