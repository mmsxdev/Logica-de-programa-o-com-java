/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

/**
 *
 * @author Aluno
 */

public class Exercicio4 {
    public static int findMax(int left, int right){
        return (left < right) ? right : left;
    }

    public static boolean isNegative(int number){
        return number < 0;
    }

    public static long power(long number, int deg){
        if(deg == 0){
            number = 1;
            return number;
        } else{
            number = power(number, deg - 1) * number;
            return number;
        }
    }

    public static long abs (long number){
        return number > 0 ? number : -number;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = -7;
        long abs = abs(c);
        System.out.println(abs);
        System.out.println(findMax(a,b));
    }
}
