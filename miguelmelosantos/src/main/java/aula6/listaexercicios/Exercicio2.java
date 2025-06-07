package aula6.listaexercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static class Pessoa {

        public String dizerInformacao(String nome) {
            return "Meu nome é " + nome;
        }

        public String dizerInformacao(int idade) {
            return "Minha idade é " + idade;
        }

        public String dizerInformacao(double peso, double altura) {
            return "Meu peso é " + peso + " e minha altura é " + altura;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int idade;
        double altura, peso;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        pessoa.dizerInformacao(nome);
        pessoa.dizerInformacao(idade);
        pessoa.dizerInformacao(peso, altura);

        scanner.close();
    }
}
