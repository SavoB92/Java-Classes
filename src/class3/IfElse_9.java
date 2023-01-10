package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';

        if(c=='M') {
            System.out.println("Male");
        }

        String name="Nat";
        // with non-primitive data types such as String we can not use == symbol.
        // relationalOperators DO NOT work with NON-PRIMITIVE data types.
        // ! symbol can change true to false and false to true
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }
        if(!name.equals("Sam")){ //in this case if we want to put that is NOT equal to, we add ! in front of name.
            System.out.println("Super amazing student");
        }

    }
}
