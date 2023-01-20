package class9;
public class ArraysDemo2 {
    public static void main(String[] args) {
// Combine all the numbers from the array data type.
        int sum=0;
        int [] numbers = {10,20,30,40,50} ;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
