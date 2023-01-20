package review4;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {



        // While loop
        int a = 1;
        while (a <= 3) {
            System.out.println("I am while loop!") ;
            a++ ;
        }

        int b = 1 ;
        do {
            System.out.println("Do While!");
        } while (b >= 3) ;


        Scanner scan = new Scanner(System.in);
        String answer;

        String anotherString;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();
        } while (!answer.equalsIgnoreCase("yes")) ;



    }
}
