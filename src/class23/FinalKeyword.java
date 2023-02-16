package class23;
public class FinalKeyword {
    final double gravity = 9.8;
    // => Using the keyword FINAL sets boundaries to our variable's value.
    double pi = 3.14;
    double lightSpeed = 299792458;

    final void tryChangingGravity () {
        // gravity = 1.6; => Typing anything with this variable name will not let us change anything unless it is changed
        // inside of the final variable stated at the beginning.
    }
}
/*
class Child extends FinalKeyword {
    void tryChangingGravity () {

    }
}*/
