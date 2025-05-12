import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // quantidade de números por linha
        int Y = sc.nextInt(); // número final da sequência

        for (int i = 1; i <= Y; i++) {
            // Se for o último número da linha, imprime sem espaço e quebra a linha
            if (i % X == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
