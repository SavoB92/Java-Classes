package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your age?");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old!");

        System.out.println("Please enter your weight?");
        double weight=scan.nextDouble();
        System.out.println("Your weight is "+weight+"lbs!");

        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Enter your gender?");
        char gender=scan.next().charAt(0); //Using a 0 inside the parenthesis we tell the system to use only first character of the input.
        System.out.println("Your gender is "+gender);

        scan.nextLine(); // Trick to make nextLine method work after using any other method from the scanner.
        System.out.println("Please enter your full name?");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); // Good practice to have this in the end of your scanner codes.

    }
}
