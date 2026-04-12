package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        //Leitura dos 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero:");
            numeros[i] = sc.nextInt();
        }

        //Antes de ordenar
        System.out.println("Antes:");
        OrdenarNumeros.ImprimirNumeros(numeros);

        //Ordenando os numeros
        OrdenarNumeros ordenarNumeros = new OrdenarNumeros();
        ordenarNumeros.BubbleSort(numeros);

        //Depois de ordenar
        System.out.println("\nDepois:");
        OrdenarNumeros.ImprimirNumeros(numeros);

        sc.close();
    }
}
