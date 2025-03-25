import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = input.nextInt();

        //calculo
        if (numero % 15 == 0){
            System.out.println("Seu numero é divisivel por 5 :)");
        }
        else {
            System.out.println("Seu numero não é divisivel por 5 :(");
        }

    }
}
