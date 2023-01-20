package class8;
public class BreakKeywordDemo2 {
    public static void main(String[] args) {

        int temp=75;

        while (temp <= 105) {
            if ( temp <= 100) {
                System.out.println("I love summer!");
            } else {
                System.out.println("It is very hot!");
            } temp+=5; // Ovo je nesto sto moramo da dodamo na kraju ako zelimo da razbijemo loop
                      // kada condition dodje do true znacenja.
        }

    }
}
