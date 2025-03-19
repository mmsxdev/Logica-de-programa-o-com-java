import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lendo o raio da esfera
        double R = input.nextDouble();

        // Definindo o valor de PI
        double PI = 3.14159;

        // Calculando o volume da esfera
        double volume = (4.0 / 3) * PI * Math.pow(R, 3);

        // Exibindo o resultado formatado com três casas decimais
        System.out.printf("VOLUME = %.3f%n", volume);

        input.close();
    }
}
