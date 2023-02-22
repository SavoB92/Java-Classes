package class27;
import java.util.ArrayList;
public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans = new ArrayList<>();

        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));
        System.out.println(booleans.size());

        for (int x = 0; x < booleans.size(); x++) {
            System.out.println(booleans.get(x));
        }
        int x = 0;
        while (x < booleans.size()) {
            System.out.println(booleans.get(x));
            x++;
        }
    }
}
