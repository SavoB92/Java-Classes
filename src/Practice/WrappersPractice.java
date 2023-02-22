package Practice;
public class WrappersPractice {
    public static void main(String[] args) {

        // WRAPPERS!
        int data = 20; // Assigning the value of 20 to the primitive data type int.
        Integer newData = new Integer(data); // Converting primitive data type into the object.
        System.out.println(data);           // This is called AutoBoxing.


        Integer newData2 = new Integer(50); // Example of directly adding value to the object type of Integer.
        System.out.println(newData2);           // This is as well called AutoBoxing.


        // HOW TO TAKE OUT VALUE FROM INTEGER OBJECT? = UNBOXING
        Integer data2 = new Integer(10);
    //  int j = i; => We can not be directly transferring value from one variable to the other. We have to use datatypeValue();
        int newData3 = data2.intValue(); // Getting a primitive value from the object is called Unboxing.
        System.out.println(newData3);

    }
}