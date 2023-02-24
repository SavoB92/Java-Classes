package Review23rdFebruary;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List <String> pcs = new ArrayList <> ();
        pcs.add("MacBook Pro");
        pcs.add("HP");
        pcs.add("Lenovo");

        System.out.println(pcs);

        for (int x = 0; x < pcs.size(); x++) {
            String task1 = pcs.get(x);
            System.out.print(pcs.get(x)+" ");
        }
        System.out.println("------------");

        for (String task2: pcs) {
            System.out.println(task2);
        }


    }
}
