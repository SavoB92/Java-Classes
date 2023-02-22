package class28;
import java.nio.DoubleBuffer;
import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer = new Integer (10);
        int number = integer; // => AUTOUNBOXING
        int number2 = integer.intValue(); // => UNBOXING

        double dbl = 12.3;
        Double wrapperD = new Double(dbl); // BOXING
        Double wrapperB = 12.3;
     // Double wrapperB = dbl; or Double wrapperB = 12.3;

        Float f = 12.4f;
        ArrayList<Float> arrayList = new ArrayList<>();
        arrayList.add(12.0f);

        double fg = 12;
    }
}
