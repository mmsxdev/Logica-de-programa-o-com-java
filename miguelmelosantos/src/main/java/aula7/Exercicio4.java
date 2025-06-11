package aula7;


import java.util.Scanner;

public class Exercicio4 {
    public static int somaDosDigitos (int number){

        // Converte o número inteiro para uma ‘String’, por exemplo: 27 vira "27"
        String numeroStr = String.valueOf(number);

        // Inicializa a variável que vai acumular a soma dos dígitos
        int soma = 0;

        // Percorre cada caracterer (dígito) da string
        for (int i = 0; i < numeroStr.length(); i++) {
            // Pega o caracterer na posição 'i' e converte ele para um número inteiro
            int digito = Character.getNumericValue(numeroStr.charAt(i));

            // Adiciona o dígito à soma
            soma += digito;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int number = scanner.nextInt();

        int soma = somaDosDigitos(number);

        System.out.println("A soma do numero digitado é de: "+ soma);
    }
}
