import java.util.Scanner;

public class AnaliseNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos 5 números inteiros
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializando variáveis para cálculo
        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        // Processamento dos dados
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
        }

        int amplitude = maior - menor;
        double media = (double) soma / numeros.length;

        // Resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Amplitude: " + amplitude);
        System.out.printf("Média aritmética: %.2f\n", media);

        System.out.print("Conjunto em ordem inversa: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
