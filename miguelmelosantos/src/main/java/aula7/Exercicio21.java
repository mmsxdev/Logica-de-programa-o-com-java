package aula7;

import java.util.Scanner;

public class Exercicio21 {

    /**
     * Verifica se todos os caracteres da string são vogais.
     * @param str A string a ser verificada.
     * @return true se todos os caracteres forem vogais, false caso contrário.
     */
    public static boolean todosCaracteresVogais(String str) {
        String vogais = "aeiou";
        for (char c : str.toLowerCase().toCharArray()) {
            if (vogais.indexOf(c) == -1) {
                return false; // Encontrou um caractere que não é vogal
            }
        }
        return true; // Todos os caracteres são vogais
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma string: "); // [cite: 54]
        String texto = scanner.nextLine();

        System.out.println("Verifique se todos os caracteres da string em questão são vogais ou não:");
        System.out.println(todosCaracteresVogais(texto)); // [cite: 54]
        scanner.close();
    }
}