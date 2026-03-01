package br.com.domain;

public class SistemaRH {
    public static void main(String[] args) {

        //Criando Funcionários - Polimorfirsmo
        Funcionario[] funcionarios = new Funcionario[3];

        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "João",
                "DEV001",
                5000.00,
                50,
                150.00
        );
        desenvolvedor.registrarHoraExtra(10);
        funcionarios[0] = desenvolvedor;

        Gerente gerente = new Gerente(
                "Pedro",
                "GER001",
                8000.00
        );
        gerente.setComissao(500);
        gerente.setBonusPerformance(1000);
        funcionarios[1] = gerente;

        Estagiario estagiario = new Estagiario(
                "Carlos",
                "DEV001",
                15.00
        );
        estagiario.registrarHorasTrabalhadas(35);
        funcionarios[2] = estagiario;

        //Processando folha de pagamento
        System.out.println("FOLHA DE PAGAMENTO");
        double totalFolha = 0;
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            totalFolha += funcionario.calcularSalario();
            System.out.println("------------------------------");
            System.out.println("Total da Folha: R$ " + totalFolha);
            System.out.println("------------------------------");
        }

        System.out.println("----------------------------");
        System.out.println("DEMONSTRAÇÃO DE POLIMORFISMO");
        System.out.println("----------------------------");
        for (Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome() + "Salário: R$ " + funcionario.calcularSalario());
        }
    }
}
