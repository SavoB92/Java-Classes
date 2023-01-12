package class7;

public class ForLoops4 {
    public static void main(String[] args) {
        /* when we do not know how many times we will be repeating the block of code inside the body of the loop
        we should be using while.
         */
        for (int i=0; i < 20; i++) {
            if (i%3!=0) { // this condition divides all the numbers under 20 and checks if the remainder is 0. If not
                          // it prints them out. So 3, 9, 12, 15, 18 are excluded in this case.
                System.out.println(i);
            }
        }
    }
}
