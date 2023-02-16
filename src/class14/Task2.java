package class14;
public class Task2 {
    public static void main(String[] args) {
// Create a string that should be a combination of letters, numbers and special characters.
// Find out how many Alphanumeric (abd AZ 284) characters are in this String.

       String str = "asdkjasdjASDKJASD321315U&*())" ;
                                       // Other than => ^
        System.out.println(str.replaceAll("[A-Za-z0-9]", "").length()) ;

    }
}
