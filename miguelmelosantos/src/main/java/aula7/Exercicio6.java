package aula7;

import java.util.Scanner;

public class Exercicio6 {
    public static void jurosCompostosInvestimento (double valor,double taxa,double tempo){
        double taxaMensal = taxa / 12 / 100;
        double valorAtual = valor;

        System.out.println("Ano\tValor Futuro");

        // Simula mês a mês o rendimento com juros compostos
        for (int ano = 1; ano <= tempo; ano++) {
            for (int mes = 1; mes <= 12; mes++) {
                valorAtual *= (1 + taxaMensal);
            }
            System.out.printf("%d\t%.2f%n", ano, valorAtual);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor, taxa;
        int tempo;

        System.out.println("Digite o valor do investimento: ");
        valor = scanner.nextDouble();
        System.out.println("Digite o valor da taxa de juros (por ano): ");
        taxa = scanner.nextDouble();
        System.out.println("Digite o tempo do investimento (em anos): ");
        tempo = scanner.nextInt();

        jurosCompostosInvestimento(valor, taxa, tempo);
    }
}
