package aula7;

import java.util.Scanner;

public class Exercicio22 {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Lê um dado do utilizador, validando os limites e a paridade.
     * @param limInf Limite inferior.
     * @param limSup Limite superior.
     * @param ehPar True se o número deve ser par, false se deve ser ímpar.
     * @return O número lido e validado.
     */
    public static int lerDados(int limInf, int limSup, boolean ehPar) { // [cite: 56]
        int valor;
        String paridadeStr = ehPar ? "PAR" : "ÍMPAR";

        do {
            System.out.printf("Digite um valor %s entre %d e %d: ", paridadeStr, limInf, limSup);
            valor = scanner.nextInt();

            boolean paridadeCorreta = ehPar ? (valor % 2 == 0) : (valor % 2 != 0);

            if (valor >= limInf && valor <= limSup && paridadeCorreta) {
                break; // Sai do ‘loop’ se o valor for válido
            } else {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (true); // [cite: 57]

        return valor;
    }

    private static void desenharParteSuperior(int margem, int largura) {
        for (int i = largura; i >= 2; i--) {
            for (int j = 0; j < margem; j++) {
                System.out.print("b");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    private static void desenharParteInferior(int margem, int largura) {
        for (int i = 2; i <= largura; i++) {
            for (int j = 0; j < margem; j++) {
                System.out.print("b");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("Y");
            }
            System.out.println();
        }
    }

    /**
     * Invoca os métodos para desenhar a figura completa.
     * @param margem A margem de espaços à esquerda.
     * @param largura A largura máxima da figura.
     */
    public static void desenharFigura(int margem, int largura) { // [cite: 58]
        desenharParteSuperior(margem, largura);
        desenharParteInferior(margem, largura);
    }

    public static void main(String[] args) {
        System.out.println("Configurando a figura:");
        int margem = lerDados(1, 9, false); // Ímpar [cite: 55]
        int largura = lerDados(6, 30, true); // Par [cite: 56]

        System.out.println("\nFigura desenhada:\n");
        desenharFigura(margem, largura);

        scanner.close();
    }
}
