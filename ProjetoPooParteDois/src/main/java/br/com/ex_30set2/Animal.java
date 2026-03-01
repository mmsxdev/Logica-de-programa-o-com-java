package br.com.ex_30set2;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String classeDoAnimal;

    public Animal(String nome, int idade, String classeDoAnimal) {
        this.nome = nome;
        this.idade = idade;
        this.classeDoAnimal = classeDoAnimal;
    }

    public abstract void emitirSom();

    public void mover() {
        System.out.println(nome + " está se movendo...");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Classe: " + classeDoAnimal);
    }
}