import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os valores de entrada
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        // Calculando a distância percorrida
        int distancia = tempo * velocidade;

        // Calculando o combustível necessário (12 Km/L)
        double litros = distancia / 12.0;

        // Exibindo o resultado com três casas decimais
        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
