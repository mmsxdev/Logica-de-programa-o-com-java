package aula7;

public class Exercicio14 {

    /**
     * Verifica se um número é primo.
     * @param num O número a ser verificado.
     * @return true se o número for primo, false caso contrário.
     */
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Encontra e exibe todos os primos gêmeos menores que um limite.
     * @param limite O valor máximo para procurar primos gêmeos.
     */
    public static void encontrarPrimosGemeos(int limite) {
        for (int i = 2; i < limite - 2; i++) {
            if (ehPrimo(i) && ehPrimo(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Resultado esperado:");
        encontrarPrimosGemeos(100);
    }
}