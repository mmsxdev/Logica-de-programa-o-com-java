public class Main {

    public static void main(String[] args) {
        int n, quociente, resto, soma;
        System.out.println("Números de 4 dígitos com tal característica");
        for (n = 1000; n <= 9999; n++) {
            quociente = n / 100;
            resto = n % 100;
            soma = quociente + resto;
            if (soma * soma == n) {
                System.out.printf("%d\n", n);
            }
        }
        System.out.println();
    }
}