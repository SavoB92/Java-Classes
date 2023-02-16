package class20;
public class Child1 extends Parent {
    public static void main(String[] args) {

        Child1 c1 = new Child1(); //OBJECT CREATED
        c1.hello();
        Parent.bye(); // Accessing static method in a static way by using class name.
        /*c1.money();
        => Not accessible because it is private!*/
        Child1.bye(); // Accessing static method from the parent class using child class name.

        c1.name = "name";
        Child1.lastName = "lastName";
    }
}
