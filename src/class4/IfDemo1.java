package class4;

public class IfDemo1 {
    public static void main(String[] args) { //if we mess up the curly or any kind of brackets and we want to make everything look neat we can use CTRL+ALT+L and InteliJ will organize it for us.

        int money = 15000;

        if (money > 1000) {
            System.out.println("Lets buy an Iphone!");
        }
        if (money > 2000) {
            System.out.println("Lets also buy a Macbook!");
        }

        boolean mothersDay = true;

        if (mothersDay) {

            System.out.println("Happy Mother's day!");
        }

        String name = "Sardar";

        if (name.equals("Sardar")) { //when it comes to using a non-primitive data type such as String in this example we have to use name.equals('String name') inside the parenthesis.

            System.out.println("I love football!");
        }
        //First we FORMAT(organize) our code by pressing CTRL+ALT+L for Windows, then we can check where our brackets start and end, or just double click inside of condition and the program will
        //highlight the complete part.
    }
}
