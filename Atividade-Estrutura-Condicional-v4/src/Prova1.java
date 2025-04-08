import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N <= 35 && N >=1){
            System.out.print("D");
        }
        else if (N <= 60 && N >=36){
            System.out.print("C");
        }
        else if (N >= 61 && N <=85){
            System.out.print("B");
        }
        else if (N >= 86 && N <=100){
            System.out.print("A");
        }
        else if (N == 0){
            System.out.print("E");
        }
    }
}