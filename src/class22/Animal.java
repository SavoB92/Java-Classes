package class22;
public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak () {
        System.out.println("Animals can speak!");
    }
    void eat () {
        System.out.println("All the animals EAT!");
    }
}

class Cat extends Animal {
    // We are overriding speak method in Cat class that already exists in parent class (animal in this case).
    // In case we decide to add the parent class method speak as well, we would add super key word such as...
    // super.speak(); => above sout in child class and it would print the parent first, and then the child sout.
    void speak () {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
}

class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}