package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number; // type casting can take the values from different types of boxes and assign the value to different type of boxes despite the value being different.
        float f=10.5f;
        int num=(int) f; // We have to know that INT data type can not showcase decimals and it will just take the whole number before the decimal and store that value only.
        /*
        byte
        short
        int
        long
        float
        double
        if we try to store the contents from a smaller box to a larger box java doesn't complain because the content can easily fit inside thge larger box but if we try to otherway artound
         */
        byte b=10;
        int number2=b; // this is the example of wanting to store value of smaller box into the bigger box which is approved by JAVA.
        short c=(short)number2; // in this case JAVA will give us an error for trying to fit a bigger box value into the smaller box value. If we want to do it correctly we have to add a
        // (short) right after = and we should be fine. We are letting Java know that we are aware of it.
        System.out.println(b);

        double num1=500.4444;
        long num2=(long) num1;

        System.out.println(num2); // the result on this is 500 since when type casting into the bigger box such as long decimals are not readable and therefore only 500 is shown.
                                  // we are putting (long) after num2= due to letting Java know we are aware of it.

    }
}

