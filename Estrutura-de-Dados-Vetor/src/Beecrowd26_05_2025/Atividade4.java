package Becrowd26_05_2025;

import java.util.Scanner;


public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[20];

        for (int i = 0; i < 20; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }

        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }

        sc.close();
    }
}