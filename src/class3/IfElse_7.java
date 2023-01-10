package class3;

public class IfElse_7 {
    public static void main(String[] args) {

        int money=150; //the following program will check the value of the money I have and if I should go shopping or not.
        System.out.println(money>=300);
        if(money>=300) //only if THIS here is TRUE, Java will run the next line as true.
        {
            System.out.println("yay lets go for shopping");
        }

        if(money<300){
            System.out.println("lets save more");
            System.out.println("maybe I am spending too much on food");
        }
    }
}
