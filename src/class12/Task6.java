package class12;
public class Task6 {
    public static void main(String[] args) {
// Create 2D array of countries: n.america countries, s.america countries, europe etc...
// Then print all values from that array using 2 different loops and calculate how many
// total countries have been stored.

    String [] [] countries = { {"USA", "CANADA", "MEXICO" },
                               {"BRAZIL", "ARGENTINA", "PERU", "COLOMBIA", "CHILE" }  ,
                               {"CHINA", "INDIA", "JAPAN", "RUSSIA" }  ,
                               {"EGYPT", "NIGERIA", "SOUTH AFRICA", "ETHIOPIA"} } ;

    int counter = 0 ;
    for (int i = 0; i < countries.length; i++) { // countries.length => number of 1D arrays.
        for (int j = 0; j < countries[i].length; j++) { // countries[i].length => It tells
            System.out.print(countries[i][j]+" ");   // us the size of those 1D arrays.
            counter++;
        }
        System.out.println();
    }
        System.out.println("Total countries: "+counter);
    }
}
/* USING ENHANCED FOR LOOP
  for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                counter++;
            }
            System.out.println();
        }

        System.out.println("Total countries "+counter);
    } */