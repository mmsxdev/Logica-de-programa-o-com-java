import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = input.nextInt();
        int[] conjuntoA = new int[N];
        int[] conjuntoB = new int[N];
        int[] conjuntoC = new int[N]; // Interseção
        int ic = 0;

        System.out.println("\nDigite os elementos do Conjunto A:");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "]: ");
            conjuntoA[i] = input.nextInt();
        }

        System.out.println("\nDigite os elementos do Conjunto B:");
        for (int i = 0; i < N; i++) {
            System.out.print("B[" + i + "]: ");
            conjuntoB[i] = input.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int elemento = conjuntoA[i];
            boolean estaEmB = false;

            for (int j = 0; j < N; j++) {
                if (elemento == conjuntoB[j]) {
                    estaEmB = true;
                    // Não pode usar return, então só marca e sai do loop
                    j = N;
                }
            }

            boolean jaEstaEmC = false;
            for (int k = 0; k < ic; k++) {
                if (conjuntoC[k] == elemento) {
                    jaEstaEmC = true;
                    k = ic; // sai do loop
                }
            }

            if (estaEmB && !jaEstaEmC) {
                conjuntoC[ic] = elemento;
                ic++;
            }
        }

        if (ic == 0) {
            System.out.println("\nConjunto vazio (não há interseção).");
        } else {
            System.out.println("\nConjunto C (interseção de A e B):");
            for (int i = 0; i < ic; i++) {
                System.out.println(conjuntoC[i]);
            }
        }

        input.close();
    }
}
