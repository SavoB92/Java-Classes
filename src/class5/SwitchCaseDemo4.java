package class5;

import java.util.Scanner;
public class SwitchCaseDemo4 {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender? F/M");
        char gender=scan.next().charAt(0);

       switch (gender){
           case 'F':
               System.out.println("Female!");
               break;
           case 'M':
               System.out.println("Male!");
               break;
           default:
               System.out.println("Not specified!");
       }


    }
}
