import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //{
            //Declaração e variáveis
            float menor, maior, media;
            int[] notas = new int[9];
            int soma = 0;
        //}

        //{
            // Preenchendo as notas e somando
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite sua N" + (i + 1) + ": ");
                notas[i] = input.nextInt();
                soma = soma + notas[i];
            }

            // Calculando a média
            media = soma / (float) notas.length;

            // Exibindo o resultado
            System.out.println("\nA média das notas é: " + media);
        //}

        //{
            //Printando as notas formatadas
            for (int i = 0; i < notas.length; i++){
                if (notas[i] >= media){
                    System.out.println("notas[" +i+ "] = " + notas[i]+" -> >= media");
                }
                else {
                    System.out.println("notas[" +i+ "] = " +notas[i]);
                }
            }
        //}

        //{
            //Lógica para calcular a maior e a menor nota
            maior = notas[0];
            menor = notas[0];
            for (int nota : notas) {
                if (menor > nota) {
                    menor = nota;
                }

                if (maior < nota) {
                    maior = nota;
                }
            }

            //Exibindo a maior e a menor nota
            System.out.println("\nA maior nota foi: "+maior);
            System.out.print("A menor nota foi: "+menor);
        //}
    }
}
