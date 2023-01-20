package class11;
public class Phone1 {
    public static void main(String[] args) {

        Phone iPhone = new Phone() ;
        iPhone.version = 10.1 ;
        iPhone.price = 1100 ;
        iPhone.color = "Black" ;
        iPhone.internet() ;
        System.out.println("*******");
        Phone samsung = new Phone() ;
        samsung.version = 9.5 ;
        samsung.price = 950 ;
        samsung.color = "White" ;
        samsung.charger();
        System.out.println("*******");
        Phone pixel = new Phone() ;
        pixel.version = 11.0 ;
        pixel.price = 1050 ;
        pixel.color = "Gray" ;
        pixel.internet();


    }
}

