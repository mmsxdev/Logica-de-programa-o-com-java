package br.com.ex_30set2;

public class Gato extends Animal {
    private boolean temPeloLongo;

    public Gato(String nome, int idade, String classeDoAnimal ,boolean temPeloLongo) {
        super(nome, idade, classeDoAnimal);
        this.temPeloLongo = temPeloLongo;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Pelo longo: " + (temPeloLongo ? "Sim" : "Não"));
    }
}
