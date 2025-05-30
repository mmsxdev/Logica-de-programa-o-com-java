package aula4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        double[] numerosReais = new double[tamanho]; // Vetor para números reais [cite: 49]
        double[] quadrados = new double[tamanho];    // Vetor para os quadrados

        System.out.println("Digite 10 números reais:");
        // Entrada de Dados
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Informe o %do. número real: ", (i + 1));
            numerosReais[i] = ler.nextDouble(); // Lendo valores double
        }

        // Calcular o quadrado das componentes
        for (int i = 0; i < tamanho; i++) {
            quadrados[i] = numerosReais[i] * numerosReais[i]; // Calculando o quadrado
        }

        // Imprimir todos os conjuntos
        System.out.println("\nConjunto original (números reais):");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%.2f ", numerosReais[i]); // Formatando a saída para 2 casas decimais
        }

        System.out.println("\n\nConjunto dos quadrados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%.2f ", quadrados[i]);
        }
        System.out.println(); // Para pular uma linha no final
        ler.close();
    }
}
