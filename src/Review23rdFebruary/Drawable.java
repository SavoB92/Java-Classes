package Review23rdFebruary;
public interface Drawable {
    String TOOL = "Pencil"; // => By default, it is public static final variable.
    void draw(); // => By default, our method becomes public abstract.
    default void print () {
        System.out.println("We are drawing object using "+TOOL);
    }
    static void erase () {
        System.out.println("All drawings are erasable!");
    }
}
// Before JAVA 8 => Above is how Interface looked.
// After JAVA 8 => Static and default methods were added to Interface.
// **************************************************************************************
abstract class Shape {
   public String color;
   protected double width, length;
   Shape (String color, double width, double length) {
       this.color = color;
       this.width = width;
       this.length = length;
   }
   public abstract double calculateArea ();
}
// **************************************************************************************
class Rectangle extends Shape implements Drawable {
    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    public double calculateArea() {
        return length * width;
    }
    @Override
    public void draw() {
        System.out.println("I am drawing a rectangle!");
    }
    // **************************************************************************************
    class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("I am drawing a square!");
        }
    }
}
// **************************************************************************************