package class22;
public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need a high school diploma!");
    }
}
    class Bachelors extends Degree {

    }

    class Masters extends Degree {
        @Override
        void getPrerequisite() {
            System.out.println("Somethind different!");
        }
    }
    class DegreeTester {
        public static void main(String[] args) {
            Degree degree = new Degree ();
            degree.getPrerequisite ();
            Bachelors bachelors = new Bachelors ();
            bachelors.getPrerequisite ();
            Masters masters = new Masters ();
            masters.getPrerequisite ();
        }
    }

/*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.

HOMEWORK:
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */