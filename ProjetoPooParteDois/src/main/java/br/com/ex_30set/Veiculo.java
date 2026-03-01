package br.com.ex_30set;

/**
 * Representa a classe base para todos os veículos.
 * Contém atributos e comportamentos comuns a qualquer veículo.
 */
public class Veiculo {
    /** A marca do veículo. */
    protected String marca;
    /** O modelo do veículo. */
    protected String modelo;
    /** O ano de fabricação do veículo. */
    protected int ano;
    /** A velocidade atual do veículo em km/h. */
    protected double velocidade;
    protected String classeDoVeiculo;
    protected String tracao;

    /**
     * Construtor para criar uma nova instância de Veiculo.
     * A velocidade inicial é definida como 0.
     *
     * @param marca A marca do veículo.
     * @param modelo O modelo do veículo.
     * @param ano O ano de fabricação do veículo.
     */
    public Veiculo(String marca, String modelo, int ano, String classeDoVeiculo, String tracao) {
        this.classeDoVeiculo = classeDoVeiculo;
        this.tracao = tracao;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    /**
     * Aumenta a velocidade atual do veículo.
     * @param incremento O valor a ser adicionado à velocidade atual.
     */
    public void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println(modelo + " acelerando para " + velocidade + " km/h");
    }

    /**
     * Reduz a velocidade atual do veículo, garantindo que não seja negativa.
     * @param decremento O valor a ser subtraído da velocidade atual.
     */
    public void frear(double decremento) {
        velocidade = Math.max(0, velocidade - decremento);
        System.out.println(modelo + " reduzindo para " + velocidade + " km/h");
    }

    /**
     * Exibe as informações básicas do veículo no console.
     */
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Classe: " + classeDoVeiculo);
        System.out.println("Tração: " + tracao);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}