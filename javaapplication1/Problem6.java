/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        long product = (long) firstNumber * secondNumber; // Use long for potential overflow
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Expected Output:");
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
        System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);

        input.close();
    }
}
