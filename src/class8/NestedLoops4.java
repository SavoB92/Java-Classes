package class8;
public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // outer for loop. Vertically how many lines i < 10 = TEN

            for (int j = 0; j < 5; j++){ // inner for loop. Horizontally how many * j < 5 = FIVE
                if(j == 1 || j == 2) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
