package aula7;

import java.util.Scanner;

public class Exercicio1 {

    public static String caracteresDeUmaString (String texto) {
        int meio = texto.length()/2;

        if (texto.length() %2 == 0){
            return texto.substring(meio -1, meio +1);
        }
        else{
            return String.valueOf(texto.charAt(meio));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um texto de sua preferência: ");
        String texto = input.next();

        String caracter = caracteresDeUmaString(texto);

        System.out.println("A caracter que está no meio do seu texto é: "+ caracter);
    }
}
