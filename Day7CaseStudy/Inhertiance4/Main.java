package Day8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the booking details : ");
    String Array = sc.next();
    String[] res1=Array.split(",");
    String stageEvent = res1[0];
    String customer = res1[1];
    int noOfSeats = Integer.parseInt(res1[2]);
    
    TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);
    System.out.println("Payment Mode :\n 1.Cash Payment \n 2.Wallet Payment \n 3.Credit Card Payment");
    int n=sc.nextInt();
    if(n==1)
    {
        System.out.println("Enter the Amount :");
        double amount=sc.nextDouble();
        System.out.println(tb.toString());
        tb.makepayment(amount);
        }
    else if(n==2)
    {
        System.out.println("Enter the Amount :");
        double amount=sc.nextDouble();
        System.out.println("Enter the Wallet : ");
        String walletNumber = sc.next();
        System.out.println(tb.toString());
        tb.makePayment(walletNumber,amount);
    }
    else{
        System.out.println("Enter the Card Holder Name :");
        String name=sc.next();
        System.out.println("Enter the Amount :");
        double amount=sc.nextDouble();
        System.out.println("Enter the Credit Card Type :");
        String creditCard = sc.next();
        System.out.println("Enter the CCV Number :");
        String ccv = sc.next();
        System.out.println(tb.toString());
        tb.makePayment( creditCard, ccv, name, amount);
        
    }
    }

}
