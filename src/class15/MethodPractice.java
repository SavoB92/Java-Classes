package class15;
public class MethodPractice {

    // create a method which returns true or false
    // takes the int numbers as a parameter if the
    // number is even it returns true, otherwise false

    boolean isEven(int number) {
        boolean returnValue;
        if (number % 2 == 0) {
            returnValue=true;
        } else {
            returnValue=false;
        }
        return returnValue;
    }
    boolean isEven1(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEven2(int number) {
        return number % 2 == 0;
    }

}
