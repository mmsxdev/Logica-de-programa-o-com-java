package Exercicio2;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetorUm = new int[1000];
        int[] vetorDois = new int[1000];
        OrdenarNumeros2 ordenar = new OrdenarNumeros2();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int valor = random.nextInt(1000);
            vetorUm[i] = valor;
            vetorDois[i] = valor;
        }

        System.out.println("\n--- Testando Bubble Sort ---");
        System.out.println("Vetor antes da ordenação:");
        ordenar.ImprimirNumeros(vetorUm);
        ordenar.BubbleSort(vetorUm);
        System.out.println("Vetor depois da ordenação:");
        ordenar.ImprimirNumeros(vetorUm);
        System.out.println("\nComparações: " + ordenar.getComparacoes());
        System.out.println("Trocas: " + ordenar.getTrocas());

        System.out.println("\n--- Testando Selection Sort ---");
        System.out.println("Vetor antes da ordenação:");
        ordenar.ImprimirNumeros(vetorDois);
        ordenar.SelectionSort(vetorDois);
        System.out.println("Vetor depois da ordenação:");
        ordenar.ImprimirNumeros(vetorDois);
        System.out.println("\nComparações: " + ordenar.getComparacoes());
        System.out.println("Trocas: " + ordenar.getTrocas());
    }
}
