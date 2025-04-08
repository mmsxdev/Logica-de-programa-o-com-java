import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int anos = N / 365;
        N%= 365;
        int meses = N / 30;
        int dias = N % 30;

        System.out.println(anos + " ano(s)"+ meses +" mes(es)" + dias + " dia(s)");
    }
}