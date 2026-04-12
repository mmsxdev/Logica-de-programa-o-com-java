package Exercicio3;

public class OrdenarNumeros3 {

    public void BubbleSortStrings(String[] palavras) {
        int n = palavras.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (palavras[j].compareToIgnoreCase(palavras[j + 1]) > 0) {
                    String temp = palavras[j];
                    palavras[j] = palavras[j + 1];
                    palavras[j + 1] = temp;
                }
            }
        }
    }

    public void ImprimirNumeros(String[] arr) {
        System.out.print("- ");
        for (String s : arr) System.out.print(s + " - ");
        System.out.println();
    }
}
