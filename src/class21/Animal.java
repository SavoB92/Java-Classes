package class21;
public class Animal {
    String name;
    String color = "Black";
    // = "Black"; => In case we would add here the value to the instance variable
    // which is pretty much never the case, we can access it here through almost
    // any subclass after creating the object.
}
    class Cat extends Animal {
    String color = "White";
    int age;
    double weight;

    void printColor () {
        String color = "Blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

