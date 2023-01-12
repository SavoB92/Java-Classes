package class7;
import java.util.Scanner;
public class WhileDemo {
    public static void main(String[] args) {

        boolean condition=true;
        Scanner scan=new Scanner(System.in);
        int number=10;
        while (condition) {
            System.out.println("Please Enter A Number Between 10 to 20: ");
            int userInput=scan.nextInt();
            if (userInput>number) {
                System.out.println("You entered the number that is greater!");
            } else if (userInput<number) {
                System.out.println("You entered the number that is smaller!");
            } else {
                System.out.println("You won!");
                condition=false;
            }
        }
    }
}
