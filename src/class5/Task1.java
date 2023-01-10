package class5;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {

/*
       int num1;
       int num2;
       int num3;
       System.out.println("Enter your number!");
       Scanner scan=new Scanner(System.in);
       num1=scan.nextInt();
       num2=scan.nextInt();
       num3=scan.nextInt();
       if(num1>num2){
           if(num1>num3){
               System.out.println("Number 1 is the largest!");
           }
       }

       if(num2>num1){
           if(num2>num3){
               System.out.println("Number 2 is the largest!");

           }
       }

       if(num3>num1){
           if(num3>num2){
               System.out.println("Number 3 is the largest!");
           }
       }
*/
         Scanner sc=new Scanner(System.in);
         double num1, num2, num3;
         System.out.println("Please enter three numbers!");
         num1=sc.nextDouble();
         num2=sc.nextDouble();
         num3=sc.nextDouble();
         if (num1>num2 && num2>num3) {
             System.out.println("Number 1 is the largest! Which is "+num1+"!");
         } else if (num2>num1 && num2>num3) {
             System.out.println("Number 2 is the largest! Which is "+num2+"!");
         } else if (num3>num1 && num3>num2) {
             System.out.println("Number 3 is the largest! Which is "+num3+"!");
         }
    }
}
