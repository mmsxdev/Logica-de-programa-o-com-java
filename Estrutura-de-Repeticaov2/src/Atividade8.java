import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor de x
        System.out.print("Digite o valor de x (em radianos): ");
        double x = sc.nextDouble();

        // Calculando o seno com 20 termos
        double senoCalculado = 0.0;
        for (int n = 0; n < 20; n++) {
            senoCalculado += Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / fatorial(2 * n + 1);
        }

        // Calculando a diferença com o valor da função SIN(x)
        double senoReal = Math.sin(x);
        double diferenca = Math.abs(senoCalculado - senoReal);

        // Imprimindo os resultados
        System.out.println("Seno calculado pela série (20 termos): " + senoCalculado);
        System.out.println("Seno fornecido pela função Math.sin(x): " + senoReal);
        System.out.println("Diferença entre os valores: " + diferenca);
    }

    // Função para calcular o fatorial
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
