import java.util.Scanner;

public class Atividade4 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o valor de X1: ");
        float valorX1 = input.nextFloat();
        System.out.print("Digite o valor de Y1: ");
        float valorY1 = input.nextFloat();
        System.out.print("Digite o valor de X2: ");
        float valorX2 = input.nextFloat();
        System.out.print("Digite o valor de Y2: ");
        float valorY2 = input.nextFloat();

        float distancia = (float) Math.sqrt(Math.pow(valorX2 - valorX1,2)+ Math.pow(valorY2 - valorY1,2));
        System.out.printf("A distancia entre A e B e: " + distancia + "\n");

    }
}
