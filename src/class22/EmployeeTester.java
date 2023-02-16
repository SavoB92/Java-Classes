package class22;
public class EmployeeTester {
    public static void main(String[] args) {

        Manager manager = new Manager ();
        manager.printSalary();

        OfficeBoy officeBoy = new OfficeBoy ();
        officeBoy.printSalary();

        Developer developer = new Developer ();
        developer.printSalary();

        Testers testers = new Testers ();
        testers.printSalary();
        testers.printHolidays();
    }
}
