package Exercicio1;

public class OrdenarNumeros {
    public void BubbleSort (int[] numeros){
        int n = numeros.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

    }

    public static void ImprimirNumeros(int[] numeros) {
        for (int n : numeros) System.out.print(n + " ");
    }
}
