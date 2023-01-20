package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

        String [] names={"Slava", "Safi", "Jason", "Nabi", "Anees", "Joseph"};
        System.out.println(names.length); // This line shows us how many values we have in a variable.
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
