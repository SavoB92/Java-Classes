package class6;

public class WhileLoop {
    public static void main(String[] args) {

        /*System.out.println("Hello World!");*/

        /*int num=1;
        if (num<3) {
            System.out.println("Hello World!");
        }
        num++;
        if (num<3) {
            System.out.println("Hello World!");
        }
        num++;
        if (num<3) { // With adding ++ to already existing value of 2 with the previous line, we get 3 and that is false for
            // this specific line since 3 is not less than 3.
            System.out.println("Hello World!");
        }
*/
        int num2=0;
        while (num2<3) {
            System.out.println("Hello World!"); // This code here is the loop! From 22nd to 25th line!
            num2++; // If this is outside the body {} it will not go into the loop because it is out and it can not execute.
        }

    }
}
