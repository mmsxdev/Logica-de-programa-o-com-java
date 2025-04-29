import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTriangular = false;

        System.out.println("Digite um numero: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){
            int tn = i * (i+1)*(i+2);

            if (tn == number){
                isTriangular = true;
                break;
            }
        }
        if (isTriangular){
            System.out.println("É triangular");
        }else{
            System.out.println("Não é triangular");
        }
    }
}
