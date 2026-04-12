package Exercicio5;

public class OrdenadorAcademico {

    public void ordenarPorNota(String[] alunos, double[] notas) {
        int n = notas.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparação: maior para o menor
                if (notas[j] < notas[j + 1]) {

                    // 1. Troca as notas no vetor
                    double tempNota = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = tempNota;

                    // 2. Troca os nomes no vetor
                    String tempAluno = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = tempAluno;
                }
            }
        }
    }

    public void exibirResultados(String[] alunos, double[] notas) {
        System.out.println("Ranking de Notas:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i] + ": " + notas[i]);
        }
    }
}
