import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exist = false;
        int []conjunto = new int [10];
        int number;

        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = input.nextInt();
        }

        number = input.nextInt();

        for (int k : conjunto) {
            if (number == k) {
                exist = true;
                break;
            }
        }

        if (exist) {
            System.out.println("Numero: " + number + " existe no conjunto");
        }
        else {
            System.out.println("Numero: " + number + " não existe no conjunto");
        }

        for (int j : conjunto) {
            System.out.print("[" + j + "]" + " ");
        }
    }
}

/*
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Criação do array de inteiros com tamanho 10
        int[] conjunto = new int[10];
        int number;

        // Variável booleana para verificar se o número foi encontrado
        boolean found = false;

        // Laço para ler os 10 números e armazená-los no array "conjunto"
        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = input.nextInt();
        }

        // Leitura do número que o usuário deseja verificar
        number = input.nextInt();

        // Laço para verificar se o número está presente no array
        for (int i = 0; i < conjunto.length; i++) {
            if (number == conjunto[i]) {
                found = true; // Se o número for encontrado, marcamos o flag como true
                break; // Sai do laço assim que o número for encontrado (não precisa continuar procurando)
            }
        }

        // Verificação e impressão do resultado baseado no flag "found"
        if (found) {
            // Se o número foi encontrado no array, imprime que ele existe
            System.out.println("Numero: " + number + " existe no conjunto");
        } else {
            // Se o número não foi encontrado, imprime que ele não existe
            System.out.println("Numero: " + number + " não existe no conjunto");
        }

        // Laço para imprimir os elementos do array "conjunto"
        for (int i = 0; i < conjunto.length; i++) {
            System.out.print("[" + conjunto[i] + "] "); // Imprime cada elemento do array com colchetes
        }
    }
}
*/
