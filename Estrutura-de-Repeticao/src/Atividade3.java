import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++){
            if (i % 2 == 0 && i != 0){
                System.out.println(i);
            }
        };
    }
}
