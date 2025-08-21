package javaapplication1;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.print("Input a number: ");
        int num = input.nextInt();


        System.out.println("Expected Output :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        input.close();
    }
}
