package class27;
public class Demo2 {
    public static void main(String[] args) {

        // Create a method which can search a name from this array and says if it is present or not.
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        String name = "Savo";
        System.out.println(contains(name, names));
    }

    public static boolean contains (String nameToBeSearched, String [] names) {
        for (String name : names) {
            if (nameToBeSearched.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
