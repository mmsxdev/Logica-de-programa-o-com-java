package Exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] nomes = {"Zuleica", "Bernardo", "Ana", "Pedro", "Carla"};
        OrdenarNumeros3 ordenar = new OrdenarNumeros3();

        System.out.println("Antes da ordenação:");
        ordenar.ImprimirNumeros(nomes);

        ordenar.BubbleSortStrings(nomes);

        System.out.println("\nDepois da ordenação:");
        ordenar.ImprimirNumeros(nomes);
    }
}
