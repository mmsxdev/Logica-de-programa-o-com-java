import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Conversão de Fahrenheit para Celsius
        System.out.print("Digite a temperatura em Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        float celsius = (5.0f / 9.0f) * (fahrenheit - 32);
        System.out.printf("A temperatura em Celsius é: %.2f°C\n", celsius);

        // Conversão de polegadas para milímetros
        System.out.print("Digite a quantidade de chuva em polegadas: ");
        float polegadas = scanner.nextFloat();
        float milimetros = polegadas * 25.4f;
        System.out.printf("A quantidade de chuva em milímetros é: %.2f mm\n", milimetros);

    }
}
