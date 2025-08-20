/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namoco;

/**
 *
 * @author User
 */


    import java.util.Scanner ;

    public class Problem4{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter a year
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            scanner.close();
        }

        // Method to determine if a year is a leap year
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }


