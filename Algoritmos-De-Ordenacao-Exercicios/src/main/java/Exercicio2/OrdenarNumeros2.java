package Exercicio2;

public class OrdenarNumeros2 {

    // Atributos para armazenar os resultados
    private int comparacoes;
    private int trocas;

    public void BubbleSort(int[] numeros) {
        int n = numeros.length;
        comparacoes = 0; // Resetar ao iniciar
        trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocas++;
                }
            }
        }
    }

    public void SelectionSort(int[] numeros) {
        int n = numeros.length;
        comparacoes = 0;
        trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numeros[i];
                numeros[i] = numeros[minIndex];
                numeros[minIndex] = temp;
                trocas++;
            }
        }
    }

    public void ImprimirNumeros(int[] numeros) {
        for (int n : numeros) System.out.print(n + " ");
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getTrocas() {
        return trocas;
    }

}