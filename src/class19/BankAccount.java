package class19;
public class BankAccount { // Parent class or super class or base class.
    long accountNumber;
    double money;

    void deposit () {
        System.out.println ("Deposit methods from Bank Account class!!");
    }
}

class Checking extends BankAccount { // Child class or sub class or derived class.
    double interest;
    void transfer () {
        System.out.println("Transfer methods from Checking class!");
    }
}

class Savings extends BankAccount {

    double profit;
    void takeProfit () {
        System.out.println("Profit class from Savings!");
    }
}
class SuperSavings extends Savings {

    void superSaving () {
        System.out.println("Super saving method from SuperSaving class!");
    }

}