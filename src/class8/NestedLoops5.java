package class8;
public class NestedLoops5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
/*      Assignment: 012345
                    12345
                    2345
        for (int i =0; i<3; i++){
            if (i==0){
                for (int j =0; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==1){
                for (int j =1; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==2){
                for (int j =2; j<=5; j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
*/
/*        // Assignment: 012345 next line 12345 next line 2345
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=10; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
/*         for (int i = 1; i < 4 ; i++) {
             for (int j = 0; j <= i * 5; j = j + i) {
                 System.out.print(j + " ");

             }
             System.out.println();
         }*/

/*        for (int i = 0; i <= 5; i++) { // This prints 0 1 2 3 4 5
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {  // This prints 0 2 4 6 8 10
            System.out.print(2*i+" ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {  // This prints 0 3 6 9 12 15
            System.out.print(3*i+" ");
        }*/