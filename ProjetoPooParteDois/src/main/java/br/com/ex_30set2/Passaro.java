package br.com.ex_30set2;

public class Passaro extends Animal {
    private double envergaduraAsas;

    public Passaro(String nome, int idade,String classeDoAnimal ,double envergaduraAsas) {
        super(nome, idade, classeDoAnimal);
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Piu Piu!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Envergadura: " + envergaduraAsas + "cm");
    }
}
