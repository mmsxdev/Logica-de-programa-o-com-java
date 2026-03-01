package br.com.ex_30set2;

public class Peixe extends Animal{
    private Boolean contemBranqueas;
    private Double comprimento;
    private String especie;

    public Peixe(String nome, int idade,String classeDoAnimal, Double comprimento, String especie, Boolean contemBranqueas) {
        super(nome, idade, classeDoAnimal);
        this.contemBranqueas = contemBranqueas;
        this.comprimento = comprimento;
        this.especie = especie;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Branqueas: " + (contemBranqueas ? "Sim" : "Não"));
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Espécie: " + especie);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está nadando!");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Plaw Plaw Plaw");
    }
}
