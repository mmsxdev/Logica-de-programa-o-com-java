import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double reais, vc;
        char moeda;
        System.out.println("Digite o valor em Reais");
        reais = ler.nextDouble();
        System.out.println("Para qual moeda deseja converter?");
        System.out.println("E - Euro\nL - Libra\nD - Dolar\nI - Iene");
        moeda = ler.next().charAt(0);
        switch (moeda) {
            case 'I' :
            case 'i' : vc = reais/1.57;
                System.out.printf("Valor em Iene é: %.2f\n",vc);
                break;
            case 'E' :
            case 'e' : vc = reais/6.02;
                System.out.printf("Valor em Euros é: %.2f\n",vc);
                break;
            case 'L' :
            case 'l' : vc = reais/6.31;
                System.out.printf("Valor em Libras é: %.2f\n",vc);
                break;
            case 'D' :
            case 'd' : vc = reais/5.71;
                System.out.printf("Valor em Dolares é: %.2f\n",vc);
                break;

            default: System.out.println("Opção Inválida");
        }
    }
}
