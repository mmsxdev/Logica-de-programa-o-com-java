import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 4 dígitos:");
        int numero = scanner.nextInt();

        // Extrai os dois primeiros e os dois últimos dígitos
        int primeiroDoisDigitos = numero / 100;
        int ultimoDoisDigitos = numero % 100;

        // Calcula a soma dos dois números formados pelos dois primeiros e últimos dígitos
        int soma = primeiroDoisDigitos + ultimoDoisDigitos;

        // Eleva ao quadrado a soma
        int quadradoSoma = soma * soma;

        // Verifica se o quadrado da soma é igual ao número original
        if (quadradoSoma == numero) {
            System.out.println("O número " + numero + " possui a característica.");
        } else {
            System.out.println("O número " + numero + " não possui a característica.");
        }

        scanner.close();
    }
}
