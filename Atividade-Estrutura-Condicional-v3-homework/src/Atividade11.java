import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalido");
            return;
        }

        System.out.println(a == b && b == c ? "Valido-Equilatero" :
                (a == b || a == c || b == c) ? "Valido-Isoceles" : "Valido-Escaleno");

        int[] sorted = {a, b, c};
        Arrays.sort(sorted);
        System.out.println(sorted[0]*sorted[0] + sorted[1]*sorted[1] == sorted[2]*sorted[2] ?
                "Retangulo: S" : "Retangulo: N");
    }
}