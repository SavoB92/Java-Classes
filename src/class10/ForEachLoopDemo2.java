package class10;
public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int [] arr = {10, 13, 20, 25, 45, 50} ;
        // arr [0] = 1; // This is how we update the single element in  an array.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0 ;
                System.out.println(arr[i]);
            }
        }

    }
}
