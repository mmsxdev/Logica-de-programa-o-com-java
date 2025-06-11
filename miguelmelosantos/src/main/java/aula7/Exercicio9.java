package aula7;

import java.util.Scanner;

public class Exercicio9 {

        //Method estático que valida a senha
    public static boolean senhaValida(String senha) {
            // Regra 1: pelo menos 10 caracteres
            if (senha.length() < 10) {
                System.out.println("1. A senha deve ter pelo menos dez caracteres.");
                return false;
            }

            int contadorDigitos = 0;

            // Regra 2 e 3: apenas letras e números, e contar os dígitos
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);

                if (!Character.isLetterOrDigit(c)) {
                    System.out.println("2. A senha deve conter apenas letras e dígitos.");
                    return false;
                }

                if (Character.isDigit(c)) {
                    contadorDigitos++;
                }
            }

            // Regra 3: pelo menos dois dígitos
            if (contadorDigitos < 2) {
                System.out.println("3. A senha deve conter pelo menos dois dígitos.");
                return false;
            }

            // Se passou por todas as regras
            return true;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Regras da senha:");
        System.out.println("1. A senha deve ter pelo menos dez caracteres.");
        System.out.println("2. A senha deve conter apenas letras e dígitos.");
        System.out.println("3. A senha deve conter pelo menos dois dígitos.");

        System.out.print("Digite uma senha (Você concorda com os Termos e Condições acima): ");
        String senha = scanner.nextLine();

        if (senhaValida(senha)) {
            System.out.println("A senha é válida: " + senha);
        } else {
            System.out.println("Senha inválida.");
        }
        scanner.close();
    }
}
