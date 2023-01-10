package class6;
import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String country=sc.next();
        /*System.out.println(country.toLowerCase());*/

        switch (country.toLowerCase()) { //Converts the text to lowercase.

            case "usa":
                System.out.println("Burgers!");
                break;
            case "Italy":
                System.out.println("Pasta!");
                break;
            case "Afghanistan":
                System.out.println("Kebab!");
                break;
            default:
                System.out.println("Wrong country!");
        }

    }
}
