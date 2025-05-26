import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = input.nextInt();
        int ic, i, j;
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

        for (int i = 0; i < conjuntoA.length; i++) {
            conjuntoC[i] = conjuntoA[i];
        }

        for (int i = 0; ic = N; i < 10 ;i++){
            boolean encontrou = false;
            j = 0;
            while (!encontrou && j < N) {
                if (conjuntoB[i] == conjuntoA[i]) {
                    achou = true;
                }
                j++;
            }
            if (!encontrou){
                conjuntoC[i] = conjuntoB[i];
                ic++;
            }
        }
        System.out.println("Conjunto C");
        for (int k = 0; k < ic; k++) {
            System.out.println("%d\t", C[k]);
        }
    }
}