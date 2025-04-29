public class Atividade5 {
    public static void main(String[] args) {
        int termos = 1000;
        double pi = 0.0;

        // Calculando o valor de pi com 1000 termos
        for (int n = 0; n < termos; n++) {
            pi += Math.pow(-1, n) / (2 * n + 1);
        }

        pi *= 4; // Multiplicando o somatório por 4

        System.out.println("Valor de pi aproximado com 1000 termos: " + pi);
    }
}
