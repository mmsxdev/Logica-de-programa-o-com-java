package aula4;

public class Exercicio1 {
    public static void main(String[] args) {
        int []vetor = {1, 0, 5, -2, -5, 7};

        int soma = vetor[0] + vetor[1] + vetor[5];

        vetor[4] = 100;

        for (int i = 0; i < 6; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Soma dos vetores [0 , 1, 5] = "+ soma);
    }
}
