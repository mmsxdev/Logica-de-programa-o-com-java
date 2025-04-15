public class Atividade8 {
    public static void main(String[] args) {
        System.out.println("Ângulo (rad)\tSeno (aproximado)");

        for (double a = 0.0; a <= 3.3; a += 0.3) {
            double seno = 0;
            int sinal = 1;

            // Série de Mac-Laurin truncada em 5 termos
            for (int i = 0; i < 5; i++) {
                int expoente = 2 * i + 1;
                double fatorial = 1;

                for (int j = 1; j <= expoente; j++) {
                    fatorial *= j;
                }

                seno += sinal * Math.pow(a, expoente) / fatorial;
                sinal *= -1;
            }

            System.out.printf("%.1f\t\t%.6f\n", a, seno);
        }
    }
}
