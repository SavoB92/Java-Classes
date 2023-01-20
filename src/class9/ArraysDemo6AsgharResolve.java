package class9;
public class ArraysDemo6AsgharResolve {
    public static void main(String[] args) {

        int [] numbers = new int [5];
        numbers [0] = 45;
        numbers [1] = 44;
        numbers [2] = 33;
        numbers [3] = 20;
        numbers [4] = 10;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i%2 ==0) {
                sum = sum+numbers[i];
            }
        } System.out.println(sum); /* I really have to pay attention to where my last line is
                                    going due to printing everything for over 20mins without
                                    knowing what is going on, and now when I have placed it one line
                                    lower it is adding and working fine.*/
    }
}
