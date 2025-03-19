import java.util.Scanner;

public class Atividade5 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite a base do seu triagulo: ");
        float base = input.nextFloat();
        System.out.print("Digite a altura do seu triagulo: ");
        float altura = input.nextFloat();

        float volume = 1/3f * base * altura;

        System.out.printf("O valor do volume de seu triangulo e de: " + volume + "\n");

    }
}