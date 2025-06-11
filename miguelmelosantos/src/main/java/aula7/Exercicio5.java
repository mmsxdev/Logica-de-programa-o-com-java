package aula7;

public class Exercicio5 {
    public static int numeroPentagonal(int n) {
        return n * (3 * n - 1)/2;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 51; i++) {
            int numberPentagonal = numeroPentagonal(i);
            System.out.println(numberPentagonal);
        }
    }
}
