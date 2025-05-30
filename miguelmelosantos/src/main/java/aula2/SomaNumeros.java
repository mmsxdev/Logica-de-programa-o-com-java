package aula2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 * @date 09/05/2025
 * @brief Class SomaNumeros
 */
public class SomaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite um numero: ");
        int number1 = input.nextInt();
        
        System.out.print("Digite um numero: ");
        int number2 = input.nextInt();
        
        int sum = number1 + number2;
        
        System.out.println("A soma de "+ number1 + " + " + number2 + " é: " + sum);
    }
}
