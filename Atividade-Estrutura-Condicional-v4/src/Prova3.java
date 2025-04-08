import java.nio.ByteBuffer;
import java.util.Scanner;

public class Prova3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double delta = B*2 - 4 * A * C;

        double x1 = ( -B + Math.sqrt(delta)) / 2*A;
        double x2 = ( -B - Math.sqrt(delta)) / 2*A;

        if (A == 0|| B == 0 || C == 0){
            System.out.println("Impossivel calcular");
        }
        else if (B < A){
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.println("(\"R1 = \" + x1 + \"\\nR2 = \" + x2);");
        }
    }
}
