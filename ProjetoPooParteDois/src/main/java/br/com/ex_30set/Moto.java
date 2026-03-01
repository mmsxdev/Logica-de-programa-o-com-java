package br.com.ex_30set;

/**
 * Representa uma Moto, que é uma especialização da classe Veiculo.
 * Adiciona atributos específicos de motos, como cilindradas e partida elétrica.
 */
public class Moto extends Veiculo {
    /** A potência do motor em cilindradas (cc). */
    private int cilindradas;
    /** Indica se a moto possui partida elétrica. */
    private boolean partidaEletrica;

    /**
     * Construtor para criar uma nova instância de Moto.
     *
     * @param marca A marca da moto.
     * @param modelo O modelo da moto.
     * @param ano O ano de fabricação da moto.
     * @param cilindradas A potência do motor em cilindradas.
     * @param partidaEletrica 'true' se a moto tiver partida elétrica, 'false' caso contrário.
     */
    public Moto(String marca, String modelo, int ano,
        String classeDoVeiculo,
        String tracao,
        int cilindradas, boolean partidaEletrica) {
        super(marca, modelo, ano, classeDoVeiculo, tracao);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    /**
     * Exibe as informações da moto, incluindo as informações básicas do veículo
     * e os detalhes específicos da moto.
     */
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }

    /**
     * Simula a ação de empinar a moto.
     */
    public void empinar() {
        System.out.println("Moto empinando!");
    }
}