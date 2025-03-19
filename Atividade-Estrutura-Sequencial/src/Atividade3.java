import java.util.Scanner;

public class Atividade3 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        // Entrada do preço de fábrica
        System.out.print("Digite o preço de fábrica do carro: ");
        float precoFabrica = scanner.nextFloat();

        // Percentuais
        float percentualDistribuidor = 12.0f / 100.0f;
        float percentualImpostos = 30.0f / 100.0f;

        // Cálculo do custo ao consumidor
        float custoConsumidor = precoFabrica + (precoFabrica * percentualDistribuidor) + (precoFabrica * percentualImpostos);

        // Exibição do resultado
        System.out.printf("O custo final ao consumidor é: R$%.2f\n", custoConsumidor);

    }
}
