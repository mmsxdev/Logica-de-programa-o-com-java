package aula4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 8;
        int[] vetor = new int[tamanho];

        System.out.println("Digite os 8 valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = ler.nextInt();
        }

        System.out.println("\nDigite as duas posições (índices de 0 a 7) para somar os valores:");
        int posX, posY;

        // Validação da entrada para X
        do {
            System.out.print("Posição X (0 a 7): ");
            posX = ler.nextInt();
            if (posX < 0 || posX >= tamanho) { // Verificando se o índice está dentro dos limites [cite: 41]
                System.out.println("Posição inválida. Tente novamente.");
            }
        } while (posX < 0 || posX >= tamanho);

        // Validação da entrada para Y
        do {
            System.out.print("Posição Y (0 a 7): ");
            posY = ler.nextInt();
            if (posY < 0 || posY >= tamanho) { // Verificando se o índice está dentro dos limites [cite: 41]
                System.out.println("Posição inválida. Tente novamente.");
            }
        } while (posY < 0 || posY >= tamanho);

        int somaPosicoes = vetor[posX] + vetor[posY]; // Acessando elementos pelas posições X e Y [cite: 41]
        System.out.printf("\nA soma dos valores em vetor[%d] (%d) e vetor[%d] (%d) é: %d\n",
                posX, vetor[posX], posY, vetor[posY], somaPosicoes);

        ler.close();
    }
}
