package class11;

import java.util.Arrays;

public class Task2HW {
    public static void main(String[] args) {

        String [][] task1 = {{"Savo", "Milica", "Anika", "Milos"},
                             {"A grade", "A grade", "A grade", "B grade"},

        } ;

        for (int i = 0; i < task1.length; i++) {
            for (int j = 0; j < task1[i].length; j++) {
                System.out.print(task1[i][j]+" ");
            } System.out.println();
        }

    }
}
