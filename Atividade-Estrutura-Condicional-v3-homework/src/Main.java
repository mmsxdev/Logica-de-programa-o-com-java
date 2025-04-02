import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        // Cálculo da média ponderada
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);

        // Impressão da média
        System.out.printf("Media: %.1f\n", media);

        // Verificação do status do aluno
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            // Leitura da nota do exame
            double notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            // Recálculo da média
            double mediaFinal = (media + notaExame) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
    }
}
