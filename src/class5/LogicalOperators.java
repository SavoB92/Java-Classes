package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);

        int num=9;
        if(num!=1){ //if we use != as an operator we only do two lines of codes instead of 10 for each number!
            System.out.println("Hello Java!");
        }else{
            System.out.println("Hello Java!");
        }

        String country="China";
        if (!country.equals("China")) {
            System.out.println("You are NOT welcome!");
        }if(country.equals("Nepal")){
            System.out.println("You are Welcome!");
        }
    }
}
