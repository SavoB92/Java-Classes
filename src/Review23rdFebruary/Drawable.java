package Review23rdFebruary;
public interface Drawable {
    public static final String tool = "Pencil";
    void draw(); // => By default, our method becomes public abstract.
    default void print () {
        System.out.println("We are drawing object using "+tool);
    }
    static void erase () {
        System.out.println("All drawings are erasable!");
    }
}
// Before JAVA 8 => Above is how Interface looked.
// After JAVA 8 => Static and default methods were added to Interface.
// **************************************************************************************
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("I am drawing a rectangle!");
    }
}
// **************************************************************************************
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("I am drawing a square!");
    }
}
// **************************************************************************************