package class6;
public class WhileLoop6 {
    public static void main(String[] args) {

       int number=1;
       boolean flag=true;
       while (flag) {
           System.out.println(number);
           if (number>3) {
               flag=false; // This line is here so the loops knows when to stop. Without this it would not stop at all.
                           // As soon as the number is bigger than 3, which is 4, flag turns into false and the loops stops.
           }
           number++;
       }

    }
}
