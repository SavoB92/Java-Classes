package review4;
public class ForLoop {
    public static void main(String[] args) {
    // Best Loop to use when we know how many times we would like to repeat our block of code.

       for (int i = 2; i <= 20; i++) {
           System.out.println(i);
       }
        System.out.println("*******");
        // Classes - 28 19th of January - Review Class
        for (int i = 2; i <= 20; i++) {
            System.out.println(i);
            if (i==12) {
                System.out.println("i is equal to 12!");
                break;
            }
        }


        for (int x = 1; x <= 10; x++) {
            if (x%3==0) {
                System.out.println(x);
                continue;
            }
            System.out.println("Hello!");
        }

    }
}
