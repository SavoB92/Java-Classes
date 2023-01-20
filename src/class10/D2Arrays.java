package class10;
public class D2Arrays {
    public static void main(String[] args) {
        String [] [] thompsonTrain = new String [3] [];
        String [] cabin0 = {"Adam", "Zafar", "Sam"};
        String [] cabin1 = {"Nabi", "Saud", "Anees"};
        String [] cabin2 = {"Safi", "Abeera", "Zahra"};

        thompsonTrain [0] = cabin0;
        thompsonTrain [1] = cabin1;
        thompsonTrain [2] = cabin2;

        System.out.println(thompsonTrain [1] [2]) ;

    }
}
