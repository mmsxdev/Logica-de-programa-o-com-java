package Exercicio4;

import java.util.Random;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetor = new int[20]; // Testando com 20 números
        Random random = new Random();
        OrdenadorMisto ordenador = new OrdenadorMisto();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        System.out.println("Vetor original:");
        ordenador.imprimir(vetor);

        ordenador.ordenarParesImpares(vetor);

        System.out.println("\nVetor ordenado (Pares primeiro, depois Ímpares):");
        ordenador.imprimir(vetor);
    }
}
