package class27;
public class Demo1 {
    public static void main(String[] args) {
        String name = "Zafar";
        String name2 = "Aiperi";
        String name3 = "Sarah";

        String [] names = {"Hiral","Nima","Laura","Nat"};
        displayNames(names);
        displayNames1(name, name2, name3);
    }
    public static void displayNames1 (String name, String name2, String name3) {
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
    public static void displayNames (String [] names) {
        for (String x : names) {
            System.out.println(x);
        }
    }
}
