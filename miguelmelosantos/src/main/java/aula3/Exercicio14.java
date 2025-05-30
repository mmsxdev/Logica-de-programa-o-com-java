package aula3;

public class Exercicio14 {
    public static void main(String[] args) {
        int contador = 0;

        for (int num = 2; num <= 1000; num++) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                contador++;
            }
        }

        System.out.println("Quantidade de números primos entre 1 e 1000: " + contador);

    }
}
