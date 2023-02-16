package class24;

public class Animal {
    void speak () {
        System.out.println("Animal sound!");
    }
    void eat () {
        System.out.println("Animal eats!");
    }
}
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow!");
    }
    @Override
    void eat() {
        System.out.println("Num num!");
    }
}
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof!");
    }
    @Override
    void eat() {
        System.out.println("Num num!");
    }
}
class Cow extends Animal {
    @Override
    void speak() {
        System.out.println("Moo!");
    }
    @Override
    void eat() {
        System.out.println("Num num!");
    }
}