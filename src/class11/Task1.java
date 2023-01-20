package class11;
public class Task1 {
    public static void main(String[] args) {
        /* Assignment. Print the following:
             *
             * *
             * * *
             * * * *
             * * *
             * *
             *        */

/*
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/
// here in the second for loop we change our J to be equal to 4-i, i = 1 in the first cycle, so it
        // goes 4 minus i which is 1, that is 3, it prints 3 stars, next cycle the i increases for
        // 1 which is the value of 2 so it goes 4 minus i, which is 2, that is two stars etc etc.
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
