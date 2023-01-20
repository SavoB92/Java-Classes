package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 5 Numbers!");
        int [] numbers = new int [5] ;
        // Below code manually store numbers in the arrays.
/*      numbers [0] = 40 ;
        numbers [1] = 50 ;
        numbers [2] = 60 ;
        numbers [3] = 70 ;
        numbers [4] = 80 ;       */
        // Below code take the numbers from user and store them in the array.
/*      numbers [0] = scan.nextInt() ; // This is how we are taking the values from the scanners and
        numbers [1] = scan.nextInt() ;// storing it into the indexes.
        numbers [2] = scan.nextInt() ;
        numbers [3] = scan.nextInt() ;
        numbers [4] = scan.nextInt() ;      */

        // Below code uses a normal for loop to ask the user for numbers and store them in the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt() ;
        } System.out.println(Arrays.toString(numbers));
    }
}
