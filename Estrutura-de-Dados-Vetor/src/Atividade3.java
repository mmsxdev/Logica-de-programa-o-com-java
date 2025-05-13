import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] conjuntoA = new int[10];

        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoA[i] = input.nextInt();
        }

        for (int numero : conjuntoA) {
            if (numero <= 1) {
                System.out.println(numero + " não é primo.");
            } else {
                boolean primo = true;

                // Verifica se o número é divisível por qualquer número entre 2 e a raiz quadrada do número
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo) {
                    System.out.println(numero + " é primo.");
                } else {
                    System.out.println(numero + " não é primo.");
                }
            }
        }
    }
}

/*
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] conjuntoA = new int[10];

        System.out.println("Digite 10 números para o conjunto A:");

        // Lê os 10 números do usuário
        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoA[i] = input.nextInt();
        }

        // Processa e verifica se cada número é primo
        System.out.println("\nResultado da verificação de primalidade:\n");

        // Cabeçalho da tabela
        System.out.printf("%-10s %-20s%n", "Número", "Primalidade");

        // Linha separadora
        System.out.println("------------------------------------");

        for (int numero : conjuntoA) {
            String resultado = (numero <= 1) ? "não é primo" : "é primo";

            // Verifica se o número é primo
            if (numero > 1) {
                boolean primo = true;

                // Verifica se o número é divisível por qualquer número entre 2 e a raiz quadrada do número
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo) {
                    resultado = "é primo";
                } else {
                    resultado = "não é primo";
                }
            } else {
                resultado = "não é primo";
            }

            // Imprime o número e o resultado de forma organizada
            System.out.printf("%-10d %-20s%n", numero, resultado);
        }

        input.close();
    }
}
*/