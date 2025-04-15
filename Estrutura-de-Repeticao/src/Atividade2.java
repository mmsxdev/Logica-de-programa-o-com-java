import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--){
            System.out.println(i);
        };
    }
}
