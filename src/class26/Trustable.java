package class26;

public interface Trustable {
    String color = "Blue!";
    int age = 10;
    int trust ();

    static void method1 () {
        System.out.println("Hello world!");
    }
}
//**********************************************************************************************************************
class Bank implements Trustable {
    @Override
    public int trust() {
        return 0;
    }
}
