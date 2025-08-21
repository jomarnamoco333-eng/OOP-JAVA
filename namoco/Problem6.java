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
public class Problem6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Range: ");
        int range = scanner.nextInt();

        

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.printf("%-4d", i * j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
 
