package class23;
public class Student {
    public void studyTime () {
        System.out.println("Study time!");
    }
    public void breakTime () {
        System.out.println("Break time!");
    }
}
class SyntaxStudent extends Student {
    @Override
    public void studyTime() {
        System.out.println("Syntax study time!!");
    }
    @Override
    public void breakTime() {
        System.out.println("Syntax break time!!");
    }
}
class CollegeStudent extends Student {
    @Override
    public void studyTime() {
        System.out.println("College study time!!");
    }
    @Override
    public void breakTime() {
        System.out.println("College break time!!");
    }
}
class SchoolStudent extends Student {
    @Override
    public void studyTime() {
        System.out.println("School study time!!");
    }
    @Override
    public void breakTime() {
        System.out.println("School break time!!");
    }
}