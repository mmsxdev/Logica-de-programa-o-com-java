import java.util.Scanner;

public class EhQuadradoPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        if (ehQuadradoPerfeito(numero)) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }

        scanner.close();
    }

    // Método para verificar se um número é quadrado perfeito
    public static boolean ehQuadradoPerfeito(int numero) {
        if (numero < 0) {
            return false; // Números negativos não são quadrados perfeitos
        }

        double raiz = Math.sqrt(numero);
        return raiz == Math.floor(raiz); // Verifica se a raiz é um número inteiro
    }
}
