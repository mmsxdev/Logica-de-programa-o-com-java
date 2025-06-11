package aula7;

import java.util.Scanner;

public class Exercicio25 {

    /**
     * Valida uma senha com base nas regras especificadas.
     * @param senha A string da senha a ser analisada.
     * @return Um código inteiro:
     * [cite_start]0 - Senha válida. [cite: 64]
     * [cite_start]1 - Não começa com maiúscula. [cite: 65]
     * [cite_start]2 - Não tem 6 caracteres. [cite: 65]
     * [cite_start]3 - Não atende a nenhuma das duas condições. [cite: 66]
     */
    public static int validarSenha(String senha) {
        boolean comecaComMaiuscula = !senha.isEmpty() && Character.isUpperCase(senha.charAt(0));
        boolean temSeisCaracteres = senha.length() == 6;

        if (comecaComMaiuscula && temSeisCaracteres) {
            return 0; // Atende a especificação
        } else if (!comecaComMaiuscula && !temSeisCaracteres) {
            return 3; // Não atende a nenhuma
        } else if (!comecaComMaiuscula) {
            return 1; // Não começa com maiúscula
        } else { // !temSeisCaracteres
            return 2; // Não tem 6 caracteres
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma senha para validar: ");
        String senha = scanner.nextLine();

        int codigoResultado = validarSenha(senha);

        System.out.println("Resultado da validação (código " + codigoResultado + "):");

        switch (codigoResultado) {
            case 0:
                System.out.println("A senha atende à especificação.");
                break;
            case 1:
                System.out.println("A senha não começa com letra maiúscula.");
                break;
            case 2:
                System.out.println("A senha não tem exatamente 6 caracteres.");
                break;
            case 3:
                System.out.println("A senha não tem 6 caracteres e não começa com maiúscula.");
                break;
        }

        scanner.close();
    }
}