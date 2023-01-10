package class4;

import java.util.Scanner;
class Main {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        String age=input.nextLine();
        String age1="10";
        System.out.println("Your age after "+age1+" years is " +age+age1);

    }
}
