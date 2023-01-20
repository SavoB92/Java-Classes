package class9;
public class ArraysDemo7 {
    public static void main(String[] args) {
         // Write a program that can tell us how many times the number 10.5 is present in the array.
           double [] arrays = {10.5, 12.0, 45, 10.5, 23, 10.5};

           int sum = 0;
           for (int i = 0; i < arrays.length; i++) {
               if(arrays[i] == 10.5) {
                   sum++;
               }
           }
        System.out.println(sum);
    }
}
