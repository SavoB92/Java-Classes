package class7;
public class ForLoops2 {
    /*
    When we do not know how many times we need to repeat a block of code we should be going with while.
    Most of the times happens when the user input is involved.
     */
    public static void main(String[] args) {
        int number=0;
        while (number<10) {
            System.out.println(number);
            number++;
        }
        /*
        int number=0;
        number<10;
        System.out.println(number);
        number++;
        number<10 (again, condition is checked)
        System.out.println(number);
         */
    }
}
