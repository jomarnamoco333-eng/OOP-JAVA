/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namoco;

import java.util.Scanner;

/**
 *
 * @author User
 */


    /**
     * This program prompts the user to enter three numbers and then determines
     * and prints the greatest of the three.
     */
    public class Problem3 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt the user to enter the third number
            System.out.print("Enter the third number: ");
            double num3 = scanner.nextDouble();

            // Variable to store the greatest number
            double greatest;

            // Use if-else if-else to find the greatest number
            if (num1 >= num2 && num1 >= num3) {
                greatest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }

            // Print the result to the console
            System.out.println("The greatest number is: " + greatest);

            // Close the scanner to prevent resource leaks
            scanner.close();

        }

    }