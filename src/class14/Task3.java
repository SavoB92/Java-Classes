package class14;
public class Task3 {
    public static void main(String[] args) {
// You have a String a = "Is it Saturday? Is it raining? Do we have a Java Class Today?"
// How would you find how many sentences are in that String.

        String str = "Is it Saturday? Is it raining? Do we have a Java Class today?" ;
/*        String [] arr = str.split("[?]") ;
        System.out.println(arr.length) ;
        System.out.println(arr[2]) ;*/
        System.out.println(str.split("[?]").length);

    }
}
