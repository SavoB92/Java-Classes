package class3;

public class RelationalOperators_6 {
    public static void main(String[] args) {
        /*
        arithmetic operators - they give us the results in the form of the same data type.
        relational operators - they change the type before we are getting our results. ALWAYS written in TRUE or FALSE.
        > greater than
        < less than
        => equal or greater
        =< equal or less
        == equal
        != is not
         */
        int number=10;
        int number2=10;
        System.out.println(number+number2);
        // 20>10 so if this is true, which is since 20 is greater than 10, computer tells us through boolean data type of true or false.
        boolean result=20>10;
        System.out.println(result);

        System.out.println(20>10); // is 20 greater than 10, result is TRUE
        System.out.println(5>10); // is 5 greater than 10, result is FALSE
        System.out.println(5!=10); // is 5 not equal to 10, result is TRUE
        System.out.println(5==10); // is 5 equal to 10, result is FALSE
        System.out.println(5==5); // is 5 equal to 10, result is TRUE
        System.out.println(10>=20); // is 10 greater or equal to 20, result is FALSE
        System.out.println(10<=20); // is 10 less than or equal to 20, result is TRUE
        System.out.println(10<=10); // is 10 less than or equal to 10, result is TRUE
    }
}
