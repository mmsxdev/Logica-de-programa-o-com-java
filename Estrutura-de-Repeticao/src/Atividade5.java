import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = input.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++){
            soma += i;
        }
        System.out.println("A soma de 1 até "+n+ " é igual a: "+soma);
    }
}
