package class3;

public class ShortHandOperator_4 {
    public static void main(String[] args) {
        int number=10;
        number=number+10; // shortcuts are called ShortHandOperators. And they are done like this:
        number+=10; // this represents the SAME thing like the line of code above "number=number+10;" ... whatever tha value is stored in number variable add 10 to it.
        System.out.println(number);
        /*
        basically += means take the previous value and add this new value to it.
         */
        int number2=20;
        number2=10;
        System.out.println(number2);

        int number3=100;
        number3/=10;
        System.out.println(number3);


    }
}
