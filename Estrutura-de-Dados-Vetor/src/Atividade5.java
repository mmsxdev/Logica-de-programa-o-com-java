import java.util.Scanner;

public class FatorialVetor {

    // Função para calcular o fatorial
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] conjuntoA = new int[10];

        // Leitura dos 10 números
        System.out.println("Digite 10 números:");
        for (int i = 0; i < conjuntoA.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            conjuntoA[i] = input.nextInt();
        }

        // Mostrar os números e seus respectivos fatoriais
        System.out.println("\nNúmero e seu fatorial:");
        for (int i = 0; i < conjuntoA.length; i++) {
            long fatorialValor = fatorial(conjuntoA[i]);
            System.out.println("Número: " + conjuntoA[i] + " - Fatorial: " + fatorialValor);
        }

        input.close(); // Boa prática: fechar o Scanner
    }
}
