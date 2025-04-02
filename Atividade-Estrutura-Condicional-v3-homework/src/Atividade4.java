import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int duration = end > start ? end - start : (24 - start) + end;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);
    }
}