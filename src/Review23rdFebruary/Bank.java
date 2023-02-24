package Review23rdFebruary;
public class Bank {
    public static void main(String[] args) {

        Customer task = new Customer();
        task.setName("Savo");
        System.out.println("Name of the customer is "+task.getName()+"!");
        task.setSsn(12341234);
        System.out.println("SSN of the customer is "+task.getSsn()+"!");

        PrivateClient pc = new PrivateClient("Savo Bozovic", 123412345);
        System.out.println("Name of our private client is "+pc.getName()+"!");
        System.out.println("SSN of our private client is "+pc.getSsn()+"!");
    }
}
