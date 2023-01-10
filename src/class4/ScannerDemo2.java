package class4;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        String mon1="1";

        Scanner mesec=new Scanner(System.in);
        System.out.println("Please enter month number");
        String num1=mesec.nextLine();
        if (num1==mon1) {
            System.out.println("January");

        }
    }
}
