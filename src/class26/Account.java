package class26;
public class Account {

    double balance;
    String accountNumber;
    String type;
    String accountTitle;

    public void setAccountNumber (String accountNumber) {
        if (accountNumber.length() != 16) {
            System.out.println("Wrong account number entered!");
        } else {
            this.accountNumber = accountNumber;
        }
    }
    public String getAccountNumber () {
        return accountNumber;
    }
    public void setBalance (double balance) {
        if (balance < 0) {
            System.out.println("Negative balance is not allowed in its current account!");
        } else {
            this.balance = this.balance + balance;
        }
    }
    public String getAccountTitle () {
        return accountTitle;
    }
    public double getBalance () {
        return  balance;
    }

    public Account (double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}
//**********************************************************************************************************************
class AccountTester {
    public static void main(String[] args) {

        Account account = new Account (-1000,"123456789","Checking", "Own");
        account.setBalance(-465454);

    }
}
//**********************************************************************************************************************