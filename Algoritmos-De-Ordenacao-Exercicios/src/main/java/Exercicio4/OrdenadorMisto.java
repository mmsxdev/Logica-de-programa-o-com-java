package Exercicio4;

public class OrdenadorMisto {

    public void ordenarParesImpares(int[] vetor) {
        int n = vetor.length;

        // Bubble Sort com regra customizada
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (deveTrocar(vetor[j], vetor[j + 1])) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Regra: Par vem antes de ímpar. Se forem do mesmo tipo, o menor vem antes.
    private boolean deveTrocar(int a, int b) {
        boolean aPar = a % 2 == 0;
        boolean bPar = b % 2 == 0;

        // Caso 1: Um é par e o outro é ímpar
        if (aPar && !bPar) return false; // Par já está na frente (certo)
        if (!aPar && bPar) return true;  // Ímpar na frente do par (precisa trocar)

        // Caso 2: Ambos são pares ou ambos são ímpares (ordem crescente comum)
        return a > b;
    }

    public void imprimir(int[] vetor) {
        for (int n : vetor) System.out.print(n + " ");
        System.out.println();
    }
}
