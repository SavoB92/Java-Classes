package class9;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        // Write a program that read a range of integers (Start and end point), provided by a user
        // and then from that range prints the sum of the even and odd integers.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Two Numbers Starting Point And Ending Point!");
        int start=scan.nextInt();
        int end=scan.nextInt();

        System.out.println("Start "+start+" end "+end);

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
