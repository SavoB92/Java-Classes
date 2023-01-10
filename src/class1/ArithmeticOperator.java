package class1;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a - b) );
        System.out.println("b / a = " + (a - b) );
        System.out.println("b % a = " + (a - b) );
        System.out.println("c % a = " + (a - b) );
        System.out.println("a++ = " + (a++) ); // which means we will add the value of the operand by 1 increment.
        System.out.println("a-- = " + (a--) ); // which means we will decrease the value of the operand by 1 increment.
        // next one is where we use the pre and post increment.
        System.out.println("d++ = " + (d++) ); // old value of d=25 and new value of d=26
        System.out.println("++d = " + (++d) ); // new value of d=26+1 = 27
    }
}
