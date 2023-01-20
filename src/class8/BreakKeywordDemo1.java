package class8;
public class BreakKeywordDemo1 {
    public static void main(String[] args) {
// Create a program below without a break keyword.
        boolean summer=true;
        int temperature=75;

        for (int i = 75; i <= 100; i+=5) {
            System.out.println("I love summer!");
        }
        System.out.println("It is very hot!");

    }
}
/*        boolean summer=true;
        int temp=75;

        while (summer) {
            if (temp <= 100) {
                System.out.println("I Love Summer Because Temperature Is "+temp);
            } else {
                System.out.println("It Is Very Hot, The Temperature Is "+temp);
                break; // This loop has a separate condition but with the help of break we can break
            }         // the loop with another statement. This is only just another flexibility if
                     // we are dealing with 10+ variables for instance inside of one loop. When
                    // something fails inside of the loop we can use the break to stop the loop.
            temp+=5;

        }*/