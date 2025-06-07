/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

package aula6;

public class Exercicio1 {

    public static int findBiggest (int[] numbers){
        int max;
        max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int array[] = new int[] {2,3,4,5,6,7};
        int max = findBiggest(array);
        System.out.println("O maior numero do array é: " + max);
    }
}
