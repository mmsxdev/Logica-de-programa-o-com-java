/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio3 {

    public static void repeater (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que eu repito depois de você?");
        String s = scanner.nextLine();
        System.out.println(s);
    }


    public static void main(String[] args) {
        repeater();
    }
}
