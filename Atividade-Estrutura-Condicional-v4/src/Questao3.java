import java.util.Scanner;

public class Questao3 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int idade;
            System.out.println("Digite a idade");
            idade = ler.nextInt();
            if (idade < 16) {
                System.out.println("Não eleitor");
            } else {
                if (idade < 18 || idade > 65) {
                    System.out.println("Eleitor facultativo");
                } else {
                    System.out.println("Eleitor obrigatório");
            }
        }
    }
}
