package class25;

interface Washable {
    void wash ();
}
// ********************************************* I N T E R F A C E *****************************************************
public class SmartWatch implements Washable {

    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch without any issues!");
    }
}
//**********************************************************************************************************************
class Phone implements Washable {
    public void wash () {
        System.out.println("I am IP65 Rated, you can wash me!");
    }
}
//**********************************************************************************************************************
class Inverter implements Washable {
    public void wash () {
        System.out.println("I am IP65 Rated, you can wash me!");
    }
}
//**********************************************************************************************************************