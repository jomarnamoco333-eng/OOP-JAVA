import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstnum = input.nextInt();


        System.out.print("Enter the second number: ");
        int secondnum = input.nextInt();


        int product = firstnum * secondnum;


        System.out.println("The product is: " + product);


        input.close();
    }
}
