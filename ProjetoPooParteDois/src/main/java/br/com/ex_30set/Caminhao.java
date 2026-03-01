package br.com.ex_30set;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, String classeDoVeiculo, String tracao, double capacidadeCarga, int numeroEixos) {
        super(marca, modelo, ano, classeDoVeiculo, tracao);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
        System.out.println("Número de Eixos: " + numeroEixos);
    }

    public void carregar() {
        System.out.println("Caminhão " + modelo + " está carregando.");
    }

    public void descarregar() {
        System.out.println("Caminhão " + modelo + " está descarregando.");
    }
}
