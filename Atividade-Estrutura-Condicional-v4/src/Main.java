import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor total da sua compra: ");
        double valorDaCompra = input.nextDouble();
        System.out.println("Qual forma de pagamento deseja?\n1-À vista, dinheiro ou cheque, 10% de desconto\n2-À vista, cartão de credito, 5% de desconto\n3-Em 2 vezes, preço normal da etiqueta sem juros\n4-Em 3 vezes, preço normal da etiqueta + 10% de juros\n5-Sair do menu");
        int formaPagamento = input.nextInt();

        switch (formaPagamento){
            case 1:
                double desconto = valorDaCompra * 0.10;
                double valorComDesconto = valorDaCompra - desconto;
                System.out.println("Valor final a pagar com 10% de desconto: " + valorComDesconto);
                break;
            case 2:
                desconto = valorDaCompra * 0.05;
                valorComDesconto = valorDaCompra - desconto;
                System.out.println("Valor final a pagar com 5% de desconto: " + valorComDesconto);
                break;
            case 3:
                System.out.println("Valor final a pagar: " + valorDaCompra);
                break;
            case 4:
                double juros = valorDaCompra * 0.10;
                double valorComJuros = valorDaCompra + juros;
                System.out.println("Valor final a pagar: " + valorComJuros);
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.err.println("ERRO: Selecione numero de 1 a 5");
        }
    }
}