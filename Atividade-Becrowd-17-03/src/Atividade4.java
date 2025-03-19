import java.util.Scanner;


public class Atividade4 {
    public static void main(String[] args)  {
        Scanner input = new Scanner (System.in);
        int code1, np1, vu1, code2, np2, vu2;
        code1 = input.nextInt();
        np1 = input.nextInt();
        vu1 = input.nextInt();
        code2 = input.nextInt();
        np2 = input.nextInt();
        vu2 = input.nextInt();

        double valorTotal = vu1 * np1 + vu2 * np2;
        System.out.printf("VALOR A PAGAR: %.2f", valorTotal);
    }
}