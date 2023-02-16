package class23;
public class StudentTester {
    public static void main(String[] args) {

/*      Student syntaxtudent = new SyntaxStudent();
        syntaxtudent.studyTime();
        syntaxtudent.breakTime();
        System.out.println();

        Student collegeStudent = new CollegeStudent();
        collegeStudent.studyTime();
        collegeStudent.breakTime();
        System.out.println();

        Student schoolStudent = new SchoolStudent();
        schoolStudent.studyTime();
        schoolStudent.breakTime();
        System.out.println();                            */

        Student [] array = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student newArrayName : array) {
            newArrayName.studyTime();
            newArrayName.breakTime();
            System.out.println();
        }
    }
}
