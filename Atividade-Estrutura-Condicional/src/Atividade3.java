import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes, ano;
        System.out.println("Digite o mês: ");
        mes = input.nextInt();

        System.out.println("Digite o ano: ");
        ano = input.nextInt();

        switch (mes){
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                    int dias = 29;
                    System.out.println("Ano: "+ano+" Mês: " + mes + " tem "+ dias+" dias!");
                }
                break;
            case 4:

            case 6:

            case 9:

            case 11:
                int dias = 30;
                System.out.println("Ano: "+ano+" Mês: " +mes+ " tem "+dias+" dias!");
                break;
            default:
                dias = 31;
                System.out.println("Ano: "+ano+" Mês: " + mes + " tem "+ dias+" dias!");
        }
    }
}
