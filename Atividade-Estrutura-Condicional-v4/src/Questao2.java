import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu número de identificação: ");
        double nDeIdent = input.nextDouble();
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.println("Digite a media de exercicios: ");
        double mediaDeExerc = input.nextDouble();

        //calculo
        double mediaDeAprov = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaDeExerc) /7;

        if (mediaDeAprov >=9.1 && mediaDeAprov <10){
            System.out.println("APROVADO! CONCEITO = A");
        }
        else if (mediaDeAprov >=7.6 && mediaDeAprov <9){
            System.out.println("APROVADO! CONCEITO = B");
        }
        else if (mediaDeAprov >=6.1 && mediaDeAprov <7.5){
            System.out.println("REPROVADO! CONCEITO = C");
        }
        else if (mediaDeAprov >=4.1 && mediaDeAprov <6.0){
            System.out.println("REPROVADO! CONCEITO = D");
        }
        else {
            System.out.println("REPROVADO! CONCEITO = E");
        }
    }
}
