package br.com.ex_30set;

/**
 * Classe principal para testar a hierarquia de classes de Veiculo.
 * Cria instâncias de Carro e Moto, e demonstra o polimorfismo.
 */
public class TesteVeiculos {
    /**
     * Método principal (ponto de entrada) da aplicação.
     * Cria uma frota de veículos, exibe suas informações e simula a aceleração.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, "B" ,"Automotor", 4, true),
                new Moto("Honda", "CG 160", 2021, "A" ,"Automotor", 160, true),
                new Caminhao("Volvo", "FH 540", 2022, "E", "Traseira 6x4", 30.5, 6)
        };

        // Itera sobre a frota, exibindo informações e acelerando cada veículo.
        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);
            System.out.println("---");
        }
    }
}