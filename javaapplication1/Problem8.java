package javaapplication1;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        double radius;
        double area;
        double perimeter;


        Scanner input = new Scanner(System.in);

    
        System.out.print("Radius: ");
        radius = input.nextDouble();

        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;


        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

      
      

        input.close();
    }
}
