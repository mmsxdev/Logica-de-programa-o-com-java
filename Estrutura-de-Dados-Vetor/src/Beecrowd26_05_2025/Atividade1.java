package Becrowd26_05_2025;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = input.nextInt();
        int[] conjuntoA = new int[N];
        int[] valores = new int[2000];
        int[] contagens = new int[2000];
        int totalUnicos = 0;

        // Leitura e contagem
        for (int i = 0; i < N; i++) {
            conjuntoA[i] = input.nextInt();
            int numeroAtual = conjuntoA[i];
            boolean encontrado = false;

            for (int j = 0; j < totalUnicos; j++) {
                if (valores[j] == numeroAtual) {
                    contagens[j]++;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                valores[totalUnicos] = numeroAtual;  // ←-- aqui o valor correto
                contagens[totalUnicos] = 1;
                totalUnicos++;
            }
        }

        // Ordenação dos valores e contagens
        for (int i = 0; i < totalUnicos - 1; i++) {
            for (int j = 0; j < totalUnicos - 1 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    int tempValor = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = tempValor;

                    int tempCont = contagens[j];
                    contagens[j] = contagens[j + 1];
                    contagens[j + 1] = tempCont;
                }
            }
        }

        // Impressão do resultado
        for (int i = 0; i < totalUnicos; i++) {
            System.out.println(valores[i] + " aparece " + contagens[i] + " vez(es)");
        }
    }
}