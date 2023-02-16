package class19;
public class ConstructorChain {

    ConstructorChain () { // non argument constructor.
        System.out.println("I am non argument constructor!");
    }
    ConstructorChain (String str) { // parametrized constructor!
        this (); // this () always MUST be on the first line.
        System.out.println(str);
    }
    ConstructorChain (int number) {
        this ("hello");
        System.out.println("This is constructor with integer parameter!");
    }

    public static void main(String[] args) {
        ConstructorChain obj = new ConstructorChain(10) ;
        System.out.println("---END OF THE CODE---");
        }
    }



