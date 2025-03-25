import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um a:");
        int a = input.nextInt();
        System.out.println("Digite um b:");
        int b = input.nextInt();
        System.out.println("Digite um c:");
        int c = input.nextInt();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("RAÍZES IMAGINÁRIAS");
            } else if (delta == 0) {
                System.out.println("RAIZ ÚNICA");
                double raiz = -b / (2 * c);
                System.out.println("Raiz: " + raiz);
            } else {
                System.out.println("RAÍZES DISTINTAS");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        System.out.println();
    }
}
