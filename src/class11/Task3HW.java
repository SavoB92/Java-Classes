package class11;

import java.util.Arrays;

public class Task3HW {
    public static void main(String[] args) {

        String [] cars = {"American", "Korean", "German", "Italian",} ;
        System.out.println(Arrays.toString(cars));
        // first Loop
        for (int x = 0; x < cars.length; x++) {
            System.out.println(cars[x]);
        }
        // second Loop
        int x = 0;
        while (x < cars.length) {
            System.out.println(cars[x]);
            x++;
        }

    }
}
