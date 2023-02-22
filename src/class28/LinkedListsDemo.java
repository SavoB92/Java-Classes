package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        name.add("Artem");
        name.add("Elvira");
        name.add("Tammana");
        name.add("Temuz");
        name.add("Sam");
        System.out.println(name);

        for (String list : name) {
            System.out.println(list);
        }

    }
}
