package class11;

import java.util.Arrays;

public class Example1point1 {
    public static void main(String[] args) {

        int [] [] matrix = { {10, 20, 30},
                             {45, 55, 66},
                             {30, 40, 20, 10, 25}
        } ;
        // We specify the dataType we will be getting from this loop.
        for (int [] array: matrix) {
            for (int number: array) {
                System.out.println(number+" ");
            }
            System.out.println();
        }

    }
}
