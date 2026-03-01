package br.com.ex_30set;

/**
 * Representa um Carro, que é uma especialização da classe Veiculo.
 * Adiciona atributos específicos de carros, como número de portas e ar condicionado.
 */
public class Carro extends Veiculo {
    /** O número de portas do carro. */
    private int numeroPortas;
    /** Indica se o carro possui ar condicionado. */
    private boolean arCondicionado;

    /**
     * Construtor para criar uma nova instância de Carro.
     *
     * @param marca A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano O ano de fabricação do carro.
     * @param numeroPortas O número de portas do carro.
     * @param arCondicionado 'true' se o carro tiver ar condicionado, 'false' caso contrário.
     */
    public Carro(String marca, String modelo, int ano,
        String classeDoVeiculo,
        String tracao,
        int numeroPortas,
        boolean arCondicionado) {
        super(marca, modelo, ano, classeDoVeiculo, tracao);
        this.numeroPortas = numeroPortas;
        this.arCondicionado = arCondicionado;
    }

    /**
     * Exibe as informações do carro, incluindo as informações básicas do veículo
     * e os detalhes específicos do carro.
     */
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + numeroPortas);
        System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
    }

    /**
     * Simula a ação de abrir o porta-malas do carro.
     */
    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto!");
    }
}