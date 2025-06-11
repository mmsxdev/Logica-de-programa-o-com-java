package aula7;


import java.util.Scanner;

public class Exercicio3 {

    public static int quantidadeDePalavras (String texto){
        String[] palavras = texto.trim().split("\\s+");
        int qtdDePalavras = palavras.length;
        return qtdDePalavras;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um texto de sua preferência: ");
        String texto = input.nextLine(); // melhor usar nextLine para pegar frase inteira

        int qtdDePalavras = quantidadeDePalavras(texto);

        System.out.println("O número de vogais no seu texto é: " + qtdDePalavras);
    }
}
