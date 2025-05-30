package aula4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroAlunos = 15;
        double[] notas = new double[numeroAlunos]; // Vetor para armazenar as notas (podem ser decimais)
        double somaNotas = 0;

        System.out.println("Digite as notas da prova dos " + numeroAlunos + " alunos:");
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.printf("Nota do aluno %d: ", (i + 1));
            notas[i] = ler.nextDouble();
            somaNotas += notas[i]; // Acumula a soma das notas [cite: 59]
        }

        double mediaGeral = somaNotas / numeroAlunos;

        System.out.printf("\nA média geral das notas é: %.2f\n", mediaGeral);
        ler.close();
    }
}
