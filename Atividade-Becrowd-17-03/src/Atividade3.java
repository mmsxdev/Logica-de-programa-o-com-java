
import java.util.Scanner;
public class Atividade3 {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        String  Nome;
        double SalarioFixo, TotalVendas, SalarioFinal;
        Nome = input.next();
        SalarioFixo = input.nextInt();
        TotalVendas = input.nextInt();
        SalarioFinal = SalarioFixo+TotalVendas *0.15;
        System.out.printf("TOTAL = R$ %.2f", SalarioFinal);
    }

}