/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namoco;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(+ number + " is positive.");
        
        }
           }
    
}
