package class13;
public class Task1 {
    public static void main(String[] args) {
        /* 1) Create a string and if the String is not empty perform the following:
        *  2) If the String has an odd number of characters and has 3 or more
        *  characters, print the character in the middle of the String
        * For Example: String str = hello*/
        String str = "hello" ;

        if (!str.isEmpty()) {
            // Next line checks if the number of characters are odd.
            if (str.length()%2 != 0 && str.length()>3) {
                int middle = str.length()/2 ;
                System.out.println(str.charAt(middle));

            }
        }

    }
}
