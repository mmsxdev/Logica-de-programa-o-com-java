import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        int horas = N / 3600;
        N %= 3600;
        int minutos = N / 60;
        int segundos = N % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}