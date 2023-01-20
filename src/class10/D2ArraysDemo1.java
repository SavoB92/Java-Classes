package class10;
public class D2ArraysDemo1 {
    public static void main(String[] args) {

        int [] [] array = { {10, 20, 30},
                            {55, 22, 45},
                            {100, 220, 450},
        } ;
       // System.out.println(array [1] [1]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i] [j]+" ");
            }
            System.out.println();
        }

    }
}
