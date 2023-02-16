package class13;
public class StringRecap {
    public static void main(String[] args) {
// How do I pring all the letters from this String?
        String str = "Java is great" ;

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
// How many times the letter a has appeared in the above string?
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') ;
            count++ ;
        }
        System.out.println(count);
    }
}
