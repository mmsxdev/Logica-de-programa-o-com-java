package aula6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

import static java.lang.Math.max;

public class Exercicio2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        String string1 = "Eu estou ";
        String string2 = "AQUI!!";
        String string3 = string1.concat(string2);


        int max = max(a, b);
        System.out.println(max);
        System.out.println(string3);
    }
}
