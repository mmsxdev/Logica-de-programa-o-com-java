import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = input.nextInt();

        if (number < 0){
            System.err.println("Digite um numero acima de 0!");
        } else if (number == 0) {
            System.err.println("Digite um numero acima de 0!");
        }else {
            int fatorial = 1;
            for (int i = 1; i <= number; i++){
                fatorial *= i;
            }
            System.out.println(number + "! = " + fatorial);
        }
        input.close();
    }
}
