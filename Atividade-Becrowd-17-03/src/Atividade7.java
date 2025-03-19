import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lendo a distância total percorrida (inteiro)
        int X = input.nextInt();

        // Lendo o total de combustível gasto (real)
        double Y = input.nextDouble();

        // Calculando o consumo médio
        double consumoMedio = X / Y;

        // Exibindo o resultado com 3 casas decimais
        System.out.printf("%.3f km/l%n", consumoMedio);

        input.close();
    }
}
