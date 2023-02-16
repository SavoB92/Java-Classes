package class17;
public class Task3 {
    public static void main(String[] args) {
        /*
Create a method that will accept a String as a parameter and return a new
string that consist only of vowels.
Method should be available only inside the class where it was declared and
executed by calling its name.
return type => String
name => getOnlyVowels
parameters => String inputStr
*/
        System.out.println(getOnlyVowels("Java"));
    }
    private static  String getOnlyVowels (String inputStr) {
        // AEIOUY aeiouy
       // Asghar => Aa
        return inputStr.replaceAll("[^AEIOUYaeiouy]", "") ;

    }
}