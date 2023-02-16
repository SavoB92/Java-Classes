package class13;
public class Task3 {
    public static void main(String[] args) {
/*   Write a program that reads two people's first names and if they
* are expecting a boy or a girl?
*    Based on the input suggest a name for a baby?
* Example output:
*    Mom's first name: Mary
*    Dad's first name: Daniel
*    Boy or girl? Boy
*    Suggested baby name: Danry
* */

     String dadsName = "Zafar" ;
     String momsName = "Maryum" ;
     String expectation = "Girl" ;
     String firstHalf = "" ;
     String secondHalf = "" ;

     if (expectation.equalsIgnoreCase("boy")) {
         // Line below will give us first half of any name.
         firstHalf = dadsName.substring(0, dadsName.length()/2) ;
         // Line below will give us second half of any name.
         secondHalf = momsName.substring(momsName.length()/2) ;
         System.out.println(firstHalf+secondHalf) ;
     } else {
         firstHalf = momsName.substring(0, momsName.length()/2) ;
         secondHalf = dadsName.substring(dadsName.length()/2) ;
         System.out.println(firstHalf+secondHalf) ;
     }

    }
}
