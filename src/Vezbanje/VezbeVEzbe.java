package Vezbanje;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner skener=new Scanner(System.in);
        System.out.println("Please enter your gender?");
        String gender=skener.next();
        System.out.println("Please enter your age?");
        int age=skener.nextInt();

        if (age>25&&gender.equals("man")) {
            System.out.println("man");
        } else if ((age>25) && (gender.equals("woman"))){
            System.err.println("woman");
        } else if ((age<25) && (gender.equals("man"))) {
            System.out.println("boy");
        } else if ((age<25) && (gender.equals("woman"))) {
            System.err.println("girl");

        }
    }
}
