package Practice;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedLIstPractice {
    public static void main(String[] args) {

        LinkedList <Integer> linky = new LinkedList<>();
        linky.add(6);
        linky.add(78);
        linky.add(1);

        System.out.println(linky.isEmpty());

/*        Iterator it = linky.iterator(); => This is the way we search for a specific element inside our LinkedList.
        while (it.hasNext()) {
            if ((int) it.next() == 78) {
                System.out.println("We found 78!");
            }
        }             */

    }
}
// Good thing about LinkedList is that every value, element, index inside of it knows everything that is in front of it,
// behind it etc. so it is very flexible data structure.