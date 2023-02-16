package class12;
public class StringDemo {
    public static void main(String[] args) {
        // Creating an object of the String class.
        String name = new String("Java") ;
        // Another way of creating an object of a String class, shorter way.
        String name1 = "Java" ;

        System.out.println(name1.length()) ; // This is a method.
                                            // Input goes inside the inside parenthesis.
        String fruit = "Banana " ;
        System.out.println(fruit.length()); // If we want to calculate how many elements are
                                           // inside of this method, we use .length method.

        int len =  fruit.length() ;       // another way of writing and getting the same
        System.out.println(len);         // output.

        String name3 = "Hamid Poya " ;
        if (name3.length()>10) {
            System.out.println("Name can not be more than 10 letters!");
        }
    }
}
