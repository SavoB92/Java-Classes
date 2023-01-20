package Vezbanje;
import java.util.*;
public class VezbeScanner {
    public static void main(String[] args) {
        Scanner number1=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=number1.nextInt();
        int b=10;
        int c=a+b;
        System.out.println("Your age plus "+b+" is "+c);
    }
}
