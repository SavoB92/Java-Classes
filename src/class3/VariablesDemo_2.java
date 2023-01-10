package class3;

public class VariablesDemo_2 { // If renaming of the whole class is needed, RIGHT CLICK on the name of the class here in the line of code, REFACTOR = RENAME = ENTER. It will change everywhere.
    public static void main(String[] args) {
        int age=10;
        System.out.println(age); // if there is a name of the data type that you would like to rename but you have used it on the multiple places, right click on the name of the data type inside
        // of a sout.println(NAME) and go REFACTOR=RENAME. It should rename everywhere...
        age=20;
        System.out.println(age);
        int number=10;
        age=number; // we can assign different name to the already existing name box.
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;
        System.out.println(age);
    }
}
