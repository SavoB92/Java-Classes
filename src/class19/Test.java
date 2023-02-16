package class19;
public class Test {
    public static void main(String[] args) {

       BankAccount ba = new BankAccount() ;
       ba.accountNumber = 12345;
       ba.money = 1000;
       ba.deposit ();

        System.out.println (ba.accountNumber);
        System.out.println (ba.money);

        System.out.println("-- Creating an object of the checking account!");

        Checking check = new Checking ();
        // Features from parent.
        check.accountNumber = 5765;
        check.money = 780;
        // Features from child.
        check.interest = 0;

        check.deposit ();
        check.transfer ();

        System.out.println("-- Creating an object of the Savings account!");

        Savings save = new Savings ();
        save.accountNumber = 2312541;
        save.money = 7657;
        save.profit = 100;
        // save.interest => does not work because sibling features are not available.

        save.deposit(); // Parent.
        save.takeProfit(); // Own method.

    }
}
// Finish creating a SuperSaving features etc.