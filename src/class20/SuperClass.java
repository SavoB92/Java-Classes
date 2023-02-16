package class20;
public class SuperClass {

    SuperClass () {
        System.out.println("I am a constructor from Parent class!");
    }

    class SubClass extends SuperClass {
        SubClass () {
            super();
        }
    }

}
