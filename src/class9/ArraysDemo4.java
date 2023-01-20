package class9;
public class ArraysDemo4 {
    public static void main(String[] args) {

    char [] letters = {'A', 'B', 'C', 'D', 'E', 'F'} ;
    letters [0] = 'a'; // This is how we can change one of the letters and its value.
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
