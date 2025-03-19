
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lendo a distância em Km
        int distancia = input.nextInt();

        // Cálculo do tempo necessário (1 Km a cada 2 minutos)
        int tempo = distancia * 2;

        // Exibindo o resultado
        System.out.println(tempo + " minutos");

    }
}
