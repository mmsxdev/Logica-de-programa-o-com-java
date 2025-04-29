import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor de x
        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        double termo = 1.0;  // Começa com o primeiro termo (x^0 / 0!)
        double resultado = termo;
        int n = 1;

        // Calculando a série até que a diferença seja menor que 0.0001
        while (Math.abs(termo) > 0.0001) {
            termo *= x / n;  // Calculando o próximo termo
            resultado += termo;  // Somando o termo ao resultado
            n++;
        }

        // Calculando o valor real com a função EXP
        double expValor = Math.exp(x);

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de e^x calculado pela série: " + resultado);
        System.out.println("Valor de e^x com Math.exp: " + expValor);
        System.out.println("Número de termos utilizados: " + n);
    }
}
