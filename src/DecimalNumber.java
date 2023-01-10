public class DecimalNumber {
    public static void main(String[] args) {
        /*
        if we want to store decimal numbers (10.5 110.2 etc) in computer's memory using Java we can use the following types
        float = decimal
         */
        float myNumberBox=10.5f; // like we have to put l on the end for long, we have to put f for the end of float numbers.
        double largeDecimalBox=134545455.12121; //this is how we write the larger decimal boxes.
        System.out.println(myNumberBox);
        /*
        If we want to store characters (#,$,o,s,4) we can use char datatype with single quotes only.
         */

        char letter='o';
        char gender='m';
        char symbol='#';
        char numberChar='1';
        /*
        String data type belongs to a different category called non-primitives that is why for string rules are a little
        different for example S of String is uppercase and its color is also not blue.
         */
        String name="Sam";
        boolean hungry=true; //true means yes
        boolean sleepy=false; //false means no
    }
}
