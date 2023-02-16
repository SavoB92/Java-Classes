package class17;
public class Student {
    /*
Create a class => Call it Student
Define four instance fields like Name, Age, Weight, ID
Create 5 objects of this class
Do this task without constructors and with constructors
   */
    String name ;
    int age ;
    double height ;
    double weight ;
    long id ;

    Student (String studentName, int studentAge, double studentHeight, double studentWeight, long studentID) {
        name = studentName ;
        age = studentAge ;
        height = studentHeight ;
        weight = studentWeight ;
        id = studentID ;
    }

    void printInfo () {
        System.out.println("Name: "+name+" Age: "+age+" Height: "+height+" Weight: "+weight+" ID: "+id) ;
    }
}
