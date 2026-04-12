package Exercicio5;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        double[] notas = {7.5, 9.0, 6.0, 9.5, 8.2};

        OrdenadorAcademico ordenador = new OrdenadorAcademico();

        ordenador.ordenarPorNota(alunos, notas);
        ordenador.exibirResultados(alunos, notas);
    }
}
