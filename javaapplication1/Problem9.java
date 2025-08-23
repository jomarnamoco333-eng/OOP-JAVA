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

public class Problem9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();


        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();


        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();
        
      
        double average = (num1 + num2 + num3) / 3;


        System.out.println("Average: " + average);


        input.close();
    }
}
