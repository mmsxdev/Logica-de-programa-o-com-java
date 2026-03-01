package br.com.ex_30set2;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String classeDoAnimal ,String raca) {
        super(nome, idade, classeDoAnimal);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo!");
    }
}
