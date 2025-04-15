import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n = input.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println( i +" x "+ i + " = "+ i*n);
        }
    }
}
