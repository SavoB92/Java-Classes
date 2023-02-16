package class25;
public interface Movable {
    void move ();
}
// *********************************************************INTERFACE***************************************************
interface Own {
    void own ();
}
// *********************************************************INTERFACE***************************************************
class Car implements Movable, Own {
    @Override
    public void move() {
        System.out.println("100mph");
    }
    @Override
    public void own() {
        System.out.println("Own INTERFACE!");
    }
}
// *********************************************************************************************************************
class Dog implements Movable{
    @Override
    public void move() {
        System.out.println("Volim se gibat gibat!");
    }
}
// *********************************************************************************************************************
