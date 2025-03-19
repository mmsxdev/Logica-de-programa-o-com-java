import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição do custo do alumínio
        float custoAluminio = 100.0f; // R$ 100,00 por metro quadrado

        // Entrada do raio e altura da lata
        System.out.print("Digite o raio da lata (em metros): ");
        float raio = scanner.nextFloat();

        System.out.print("Digite a altura da lata (em metros): ");
        float altura = scanner.nextFloat();

        // Cálculo da área total da lata
        double areaBase = Math.PI * Math.pow(raio, 2); // Área da base (π * raio²)
        double areaLateral = 2 * Math.PI * raio * altura; // Área lateral (2 * π * raio * altura)
        double areaTotal = (2 * areaBase) + areaLateral; // Área total (duas bases + lateral)

        // Cálculo do custo total
        double custoTotal = areaTotal * custoAluminio;

        // Exibição do resultado
        System.out.printf("A área total da lata é: %.2f m²\n", areaTotal);
        System.out.printf("O custo total da lata é: R$%.2f\n", custoTotal);
    }
}
