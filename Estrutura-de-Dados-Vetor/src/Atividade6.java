import java.util.Scanner;

public class IntercalaVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = input.nextInt();

        int[] conjuntoA = new int[N];
        int[] conjuntoB = new int[N];
        int[] conjuntoC = new int[2 * N]; // Vetor intercalado

        // Leitura do primeiro conjunto
        System.out.println("\nDigite os elementos do Conjunto A:");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "]: ");
            conjuntoA[i] = input.nextInt();
        }

        // Leitura do segundo conjunto
        System.out.println("\nDigite os elementos do Conjunto B:");
        for (int i = 0; i < N; i++) {
            System.out.print("B[" + i + "]: ");
            conjuntoB[i] = input.nextInt();
        }

        // Intercalação dos vetores A e B no vetor C
        for (int i = 0, j = 0; i < N; i++) {
            conjuntoC[j++] = conjuntoA[i]; // Insere de A
            conjuntoC[j++] = conjuntoB[i]; // Insere de B
        }

        // Exibição do vetor intercalado
        System.out.println("\nVetor C (intercalação de A e B):");
        for (int i = 0; i < conjuntoC.length; i++) {
            System.out.println("C[" + i + "]: " + conjuntoC[i]);
        }

        input.close(); // Boa prática
    }
}
