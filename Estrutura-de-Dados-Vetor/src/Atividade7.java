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

        // Mescla ordenada dos vetores A e B no vetor C
        int i = 0, j = 0, k = 0;

        // Enquanto houver elementos em A e B, compare-os
        while (i < N && j < N) {
            if (conjuntoA[i] <= conjuntoB[j]) {
                conjuntoC[k++] = conjuntoA[i++];
            } else {
                conjuntoC[k++] = conjuntoB[j++];
            }
        }

        // Se restarem elementos em A, adicione-os
        while (i < N) {
            conjuntoC[k++] = conjuntoA[i++];
        }

        // Se restarem elementos em B, adicione-os
        while (j < N) {
            conjuntoC[k++] = conjuntoB[j++];
        }

        // Exibição do vetor intercalado
        System.out.println("\nVetor C (intercalação de A e B):");
        for (int x = 0; x < conjuntoC.length; x++) {
            System.out.println("C[" + x + "]: " + conjuntoC[x]);
        }

        input.close(); // Boa prática
    }
}
