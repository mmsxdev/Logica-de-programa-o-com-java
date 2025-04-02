import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int T = scanner.nextInt();
        int F = scanner.nextInt();
        int arrival = (S + T + F) % 24;
        System.out.println(arrival < 0 ? arrival + 24 : arrival);
    }
}