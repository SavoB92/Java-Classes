package class4;

public class IfElseIfConditionsDemo4 {
    public static void main(String[] args) {

        int number1=10;
        int number2=20;
        /*
        If wanting to debug we click on the left side of the line between number of line and the darker gray column, red dot will appear, run debug, and then we can STEP OVER all the lines until
        we get to do line where we will find the problem that occurred.
         */

        if(number1==number2){
            System.out.println("Numbers are equal");
        }else if(number1>number2){
            System.out.println("Number1 is greater than number2");
        }else if(number2>number1){
            System.out.println("Number2 is greater than number 1");
        }else{
            System.out.println("Make sure the assignment is done right!");
        }
    }
}
