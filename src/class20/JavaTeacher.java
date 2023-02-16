package class20;
public class JavaTeacher extends Teacher {

    void code () {
        System.out.println("Java teacher teaches how to code!");
    }

    public static void main(String[] args) {

        JavaTeacher java = new JavaTeacher ();
        java.teacherName = "Asel";
        java.teacherId = "A67";

        java.homework (); // public access modifier
        java.grade (); // protected access modifier
        java.scholarship (); // default access modifier
        /*java.extraPoint();*/ // => This is a private method and therefore it can not showcase.
                              // private variable and methods do not participate in inheritance.



    }

}
