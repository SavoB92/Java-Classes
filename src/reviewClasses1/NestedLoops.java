package reviewClasses1;
public class NestedLoops {
    public static void main(String[] args) {
// When we are talking about nested loops we are talking about the loops inside other loops.
       for (int x = 1; x <= 3; x++) {               // outer loop
           System.out.println(x);

           for (int j = 1; j <= 4; j++) {          // inner loop

               System.out.println(j);
           }
       }
        System.out.println("*******");

        for (int x = 1; x < 5; x++) {
            System.out.println("Hello!");

            for (int j = 1; j <= 2; j++) {
                System.out.println("Bye!");
            }
        }

    }
}
