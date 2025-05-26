import java.util.Scanner;

public class Atividade3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = input.nextInt();
        int[] conjuntoA = new int[N];
        int[] conjuntoB = new int[N];
        int[] conjuntoC = new int[N]; // Diferença A - B
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
                    break; // encontrou em B, sai do loop
                }
            }

            boolean jaEstaEmC = false;
            for (int k = 0; k < ic; k++) {
                if (conjuntoC[k] == elemento) {
                    jaEstaEmC = true;
                    break; // já está em C, não adiciona
                }
            }

            if (!estaEmB && !jaEstaEmC) {
                conjuntoC[ic] = elemento;
                ic++;
            }
        }

        if (ic == 0) {
            System.out.println("\nConjunto vazio (todos os elementos de A estão em B).");
        } else {
            System.out.println("\nConjunto C (diferença A - B):");
            for (int i = 0; i < ic; i++) {
                System.out.println(conjuntoC[i]);
            }
        }

        input.close();
    }
}
