package class6;
public class WhileLoop5 {
    public static void main(String[] args) {

       int number=1;
       int sum=0;
       while (number<=5) {
           sum=sum+number;
           number++;
       }
        System.out.println(sum); /*print out is outside the body of the loop*/

    }
}
