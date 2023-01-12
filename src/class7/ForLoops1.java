package class7;
public class ForLoops1 {
    public static void main(String[] args) {

/*        for (int i=0; i < 20; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }*/
        for (int i=1; i < 20; i+=2) { // i=i+2 - i+=2 => Same result.
            System.out.println(i);
        }
    }
}
