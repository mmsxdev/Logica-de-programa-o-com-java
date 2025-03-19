import java.util.Scanner;

public class Atividade6 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite quantas horas de uso das charretes: ");
        int horas = input.nextInt();
        float valor = (horas / 3) * 8.5f +( horas % 3)*3.5f;
        System.out.printf("Valor a pagar: R$ %.2f\n", valor);
    }
}
