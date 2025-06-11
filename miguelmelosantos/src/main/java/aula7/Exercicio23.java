package aula7;

public class Exercicio23 {

    /**
     * Calcula a função f(n) = ((-1)^n) / (2n + 1).
     * @param n Um inteiro não negativo (n >= 0).
     * @return O resultado da função como um double.
     */

    public static double f(int n) { // [cite: 59]
        // Calcula (-1)^n sem usar Math.pow
        // Se n é par, o resultado é 1. Se for ímpar, é -1.
        double numerador = (n % 2 == 0) ? 1.0 : -1.0;

        double denominador = (2.0 * n) + 1.0;

        return numerador / denominador;
    }

    public static void main(String[] args) {
        System.out.println("Testando a função f(n):");
        System.out.println("f(0) = " + f(0)); // Esperado: 1.0
        System.out.println("f(1) = " + f(1)); // Esperado: -0.333...
        System.out.println("f(2) = " + f(2)); // Esperado: 0.2
    }
}