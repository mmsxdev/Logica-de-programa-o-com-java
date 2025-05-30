package aula2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exercício 5
        System.out.print("Velocidade (km/h): ");
        double velocidade = scanner.nextDouble();
        System.out.print("Tempo de viagem (horas): ");
        double tempo = scanner.nextDouble();
        double distancia = velocidade * tempo;
        System.out.println("Distância percorrida: " + distancia + " km");
        scanner.close();
    }
}
