package Vezbe;
import java.util.Objects;
import java.util.Scanner;
public class VezbeLogicalOperators  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Two Strings?");
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println("Please Enter Two Integers?");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();

        if ((Objects.equals(word1, word2)) && (int1 == int2)) {
            System.out.println("And!");
        } else if ((Objects.equals(word1, word2)) || (int1 == int2)) {
            System.out.println("Or!");
        } else if (!(Objects.equals(word1, word2)) && !(int1 == int2)) {
            System.out.println("None!");
        } scan.close();

    }
}