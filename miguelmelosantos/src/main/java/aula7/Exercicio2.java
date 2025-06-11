package aula7;

import java.util.Scanner;

public class Exercicio2 {
    public static int vogaisDeUmaSting(String texto) {
        int contador = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um texto de sua preferência: ");
        String texto = input.nextLine(); // melhor usar nextLine para pegar frase inteira

        int numeroVogais = vogaisDeUmaSting(texto);

        System.out.println("O número de vogais no seu texto é: " + numeroVogais);
    }
}
