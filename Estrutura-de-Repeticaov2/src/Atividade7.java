import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor de x
        System.out.print("Digite o valor de x (em radianos): ");
        double x = sc.nextDouble();

        // Calculando o cosseno com 20 termos
        double cossenoCalculado = 0.0;
        for (int n = 0; n < 20; n++) {
            cossenoCalculado += Math.pow(-1, n) * Math.pow(x, 2 * n) / fatorial(2 * n);
        }

        // Calculando a diferença com o valor da função COS(x)
        double cossenoReal = Math.cos(x);
        double diferenca = Math.abs(cossenoCalculado - cossenoReal);

        // Imprimindo os resultados
        System.out.println("Cosseno calculado pela série (20 termos): " + cossenoCalculado);
        System.out.println("Cosseno fornecido pela função Math.cos(x): " + cossenoReal);
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
