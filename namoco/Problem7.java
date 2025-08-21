/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namoco;
/**
 *
 * @author User
 */
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            try {

                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {

                System.out.println("Error: invalid number!");
            }
        }

        System.out.println("Expected Output:");
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
