package class8;
public class BreakKeywordDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) { // This is a good way to break the loop due to our IF STATEMENT that
                break;   // decides when to stop/break the loop. Very simple method!
            }
            System.out.println(i);
        }
        System.out.println("Last line in our code!");
    }
}
