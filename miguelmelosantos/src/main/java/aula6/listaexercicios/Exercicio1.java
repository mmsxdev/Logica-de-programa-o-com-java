package aula6.listaexercicios;

public class Exercicio1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Corrente", 1000.00);
        Conta conta2 = new Conta("Poupança", 2000.00);

        System.out.println("\nTentando depositar R$1500 na corrente:");
        conta1.depositar(1500);

        System.out.println("\nTentando depositar R$1500 na poupança:");
        conta2.depositar(1500);

        System.out.println("\nDepositando R$98.52 na poupança:");
        conta2.depositar(98.52);

        System.out.println("\nSacando R$100 da poupança:");
        conta2.sacar(100);

        System.out.println("\nTransferindo R$1800 da corrente para poupança:");
        conta1.transferir(1800, conta2);

        System.out.println("\nTransferindo R$700 da poupança para corrente:");
        conta2.transferir(700, conta1);

        System.out.println("\nSacando R$1000 da poupança:");
        conta2.sacar(1000);

        System.out.println("\nSacando R$1000 da corrente:");
        conta1.sacar(1000);
    }

    public static class Conta {

        private String tipo;
        private double saldo;

        public Conta(String tipo, double saldoInicial) {
            this.tipo = tipo;
            this.saldo = saldoInicial;
        }

        public double sacar(double valor) {
            if (valor > saldo) {
                System.out.println("Saque falhou: saldo insuficiente.");
                return saldo;
            } else {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
                return saldo;
            }
        }

        public double depositar(double valor) {
            if (tipo.equalsIgnoreCase("Corrente") && valor > 1000.00) {
                System.out.println("Depósito falhou: valor acima de R$ 1000,00 para conta corrente.");
                return saldo;
            } else {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
                return saldo;
            }
        }

        public boolean transferir(double valor, Conta destino) {
            if (this.tipo.equalsIgnoreCase("Poupança")) {
                System.out.println("Transferência falhou: não é permitido transferir da poupança.");
                return false;
            }

            if (!destino.tipo.equalsIgnoreCase("Poupança")) {
                System.out.println("Transferência falhou: só pode transferir para conta poupança.");
                return false;
            }

            if (valor > this.saldo) {
                System.out.println("Transferência falhou: saldo insuficiente.");
                return false;
            }

            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
            return true;
        }

        public double getSaldo() {
            return saldo;
        }

        public String getTipo() {
            return tipo;
        }
    }
}
