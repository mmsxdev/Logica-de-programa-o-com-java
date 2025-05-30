package aula3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();
        int resultado = 1;

        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println(x + "^" + y + " = " + resultado);

    }
}
