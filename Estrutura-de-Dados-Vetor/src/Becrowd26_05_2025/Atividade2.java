package Becrowd26_05_2025;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N[] = new int[10];
        int x;

        x = sc.nextInt();

        for (int i = 0; i < N.length; i++) {
            N[i] = x;
            x = x * 2;
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
}
