package class12;
public class StringDemo8 {
    public static void main(String[] args) {

        String str = "Java is love!" ;
        char character = str.charAt(0) ;

        /*
        System.out.println(character) ;
        */

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
            sum++;
           }
        }
        System.out.println(sum);
    }
}


