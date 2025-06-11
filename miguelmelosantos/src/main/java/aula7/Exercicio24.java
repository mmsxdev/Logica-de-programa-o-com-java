package aula7;

public class Exercicio24 {

    // Reutilizando a função do exercício 23
    public static double f(int n) { // [cite: 59]
        double numerador = (n % 2 == 0) ? 1.0 : -1.0;
        double denominador = (2.0 * n) + 1.0;
        return numerador / denominador;
    }

    /**
     * Calcula uma aproximação de Pi usando a série de Taylor com N termos.
     * pi = 4 * sum(f(i)) para i de 0 a N-1
     * @param N O número de termos da série.
     * @return A aproximação de Pi.
     */
    public static double calcularPi(int N) { // [cite: 61]
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma += f(i);
        }
        return 4 * soma;
    }

    public static void main(String[] args) {
        System.out.println("Cálculo de Pi com a série de Taylor:");
        System.out.println("-------------------------------------");
        System.out.println("| Termos (N) | Valor de Pi Aproximado |");
        System.out.println("-------------------------------------");

        int[] termos = {10000, 20000, 30000}; // [cite: 62]

        for (int n : termos) {
            double piAproximado = calcularPi(n);
            System.out.printf("| %-10d | %-22.15f |\n", n, piAproximado);
        }
        System.out.println("-------------------------------------");
    }
}