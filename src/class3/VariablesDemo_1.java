package class3;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=10; // requesting the computer to create a box of type int and store a value of 10 in it.
        int salary; // only create a box of type int and do not assign any value to it.
        /*
        In Java is possible to create EMPTY BOXES as well.
         */
        salary=120000; //This is the way we are just adding the value to the already existing box with no value in it.
        System.out.println(salary); // if value to the variable is not assigned already and you try to print out the name without its value, the problem will pop up, if we hover the mouse
        // over the problem (usually red underline) inteliJ will offer the solution to our problems such as INITIALIZE THE UNASSIGNED VALUE.
        String name, city, country; // we can create multiple empty boxes in a single line of code.
        char gender, letter;
        name="Daria";
    }
}
