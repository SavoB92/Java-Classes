package class19;
public class ThisKeyword {
    int a, b ; // Instance variables.
    ThisKeyword (int a, int b) { // Local variables.
        this.a = a ; // left instance variable, right local variable.
        this.b = b ;
    }

    public void sum (int a, int b) {
        System.out.println ("Sum of local variables is "+(a+b));
        System.out.println ("Sum of instance variables is "+(this.a+this.b));
    }

    void hello () {
        System.out.println("Hello batch 15");
    }

    void howAreYou () {
        System.out.println("How are you batch 15");
    }

    void greetings () {
        this.hello();    // This keyword refers to the current instance methods.
        this.howAreYou(); // Same here (line 23 note)
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10, 20) ; // Calling the constructor and assigning the value.
        obj.sum (100, 200);

    // -----------------------------------------------------

        obj.greetings ();

    }
}
