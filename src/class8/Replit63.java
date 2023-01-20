package class8;
import java.util.Scanner;
public class Replit63 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter The Number?");
        int x=scan.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i+" "); // If we want to print everything on the same line instead of
                                    // next lines, we remove LN from PRINTLN and it would be printed
                                   // out on the same line. To add space between the upcoming numbers
                                  // we are adding +" " inside of parenthesis as shown in the code.
        }
    }
}
