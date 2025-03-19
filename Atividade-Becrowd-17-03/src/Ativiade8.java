import java.util.Scanner;

public class Ativiade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lendo os três valores inteiros
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Calculando o maior entre a e b
        int maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Calculando o maior entre maiorAB e c
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        // Exibindo o resultado
        System.out.println(maior + " eh o maior");

        input.close();
    }
}
