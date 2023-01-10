package class4;

public class IfElseIfConditionsDemo3 {
    public static void main(String[] args) {

        int day=8;

        if(day==1){ //between curly brackets, anything in between of those two is called BLOCK of code.
            System.out.println("Monday!");
        }else if(day==2){
            System.out.println("Tuesday!");
        }else if(day==3){
            System.out.println("Wednesday!");
        }else if(day==4){
            System.out.println("Thursday!");
        }else if(day==5){
            System.out.println("Friday!");
        }else if(day==6){
            System.out.println("Saturday!");
        }else if(day==7){
            System.out.println("Sunday!");
        }else{
            System.out.println("Please enter a day between 1 and 7!");
        }

    }
}
