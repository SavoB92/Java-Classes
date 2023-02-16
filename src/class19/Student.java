package class19;

public class Student {
    String name;
    String address;
    Student(String name, String address){
        this.name= name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name: "+ name + " Address: "+ address);
    }
    public static void main(String[] args) {
        Student student = new Student("Sardar", "Islamabad");
        student.displayInfo();
    }
}