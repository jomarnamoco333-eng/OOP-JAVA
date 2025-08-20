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
public class Problem5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a single letter from the Alphabet:");

        
        String input = scanner.nextLine();

        
        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character only.");
        } else {
            
            char ch = input.charAt(0);

           
            if (!Character.isLetter(ch)) {
                System.out.println("Error: The input is not an alphabet letter.");
            } else {
                
                char lowerCaseChar = Character.toLowerCase(ch);

                
                if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                    System.out.println("Vowel");
                } else {
                    
                    System.out.println("Consonant");
                }
            }
        }

        
        scanner.close();
    }

}
