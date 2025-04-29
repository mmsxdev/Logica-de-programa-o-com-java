public class Atividade4 {

    public static void main(String[] args) {
        double soma = 0.0;
        double termo;
        int denominador = 1;
        int sinal = 1; // O primeiro termo é positivo

        // Continuamos somando enquanto o valor do termo for maior ou igual a 0,0001
        while (true) {
            termo = 1.0 / denominador;

            // Adiciona ou subtrai o termo dependendo do sinal
            soma += sinal * termo;

            // Se o valor absoluto do termo for menor que 0,0001, para
            if (Math.abs(termo) < 0.0001) {
                break;
            }

            // Alterna o sinal (de positivo para negativo e vice-versa)
            sinal = -sinal;

            // Aumenta o denominador de 2 em 2 (1, 3, 5, 7, 9, ...)
            denominador += 2;
        }

        // Multiplica o valor da soma por 4 para aproximar o valor de Pi
        double pi = 4 * soma;

        // Exibe o valor de Pi com precisão de 4 casas decimais
        System.out.printf("Valor aproximado de Pi: %.4f\n", pi);
    }
}
