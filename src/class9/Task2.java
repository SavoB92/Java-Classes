package class9;
import java.util.Scanner;
import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // Assignment: Ask the user to apply for the credit card 10 times, as soon as they say
        // yes, the program should stop running.
        for (int i = 0; i < 10; i++) {
            System.out.println("Please Give Me An Answer If You Would Like To Apply?");
            String userResponse=scan.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
