package class9;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
     /*
    4)  Write a program to ask a user to enter item they want to buy and the price of that item.
    Every time user enters money accumulate the amount and tell the user how much is left to pay off.
    If user give more money program should return a change. Whenever a user done with payments program
    should say "Thank you for shopping!"
     */

/*        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter The Name Of Your Item?");
        String name=scan.nextLine();
        System.out.println("Please Enter The Price Of Your Item?");
        double price=scan.nextDouble();
        System.out.println("This Is How Much You Need To Pay: ");
        double paidMoney=scan.nextDouble();
        if (price > paidMoney) {
            System.out.println("The Amount You Have To Pay "+(price-paidMoney)+" $");
        }else if (price < paidMoney) {
            System.out.println("This Will Be Your Change! "+(paidMoney-price)+" $");
        }
        System.out.println("Thank You For Shopping!");*/
/*

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the item you would like?");
        String item=scan.nextLine();
        String item2=scan.nextLine();
        System.out.println("What is the price of the item?");
        int price=scan.nextInt();
        int price2=scan.nextInt();
        System.out.println("This will be the amount you have to pay! "+(price+price2)+" $");
        int paidMoney=scan.nextInt();

        if (paidMoney > price+price2) {
            System.out.println("This will be your change! "+(paidMoney-(price+price2))+" $");
        }else if (paidMoney < price+price2) {
            System.out.println("You would have to add more money please! "+((price+price2)-paidMoney)+" $");
        }
        System.out.println("Thank you for shopping!");


*/
        Scanner scan=new Scanner (System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

          System.out.println("Please Enter The Item And It's Price!");
          String itemName=scan.next();
          double itemPrice=scan.nextDouble();
          totalPrice=totalPrice+itemPrice;
          System.out.println("This Is The Total Amount You Owe! "+totalPrice);
      }
        System.out.println("Please Pay For The Items");
        double amountPaid=scan.nextDouble();

        if (amountPaid>totalPrice) {
            double change=amountPaid-totalPrice;
            System.out.println("Here Is Your Change! "+change);
        } else if (amountPaid<totalPrice) {
            System.out.println("You Can Not Buy All The Items!");
        }
        System.out.println("Thank You For Your Shopping!");

    }
}
