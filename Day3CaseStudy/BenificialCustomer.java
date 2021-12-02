import java.util.Scanner;
public class BenificialCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int offer2=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the first product price :");
     int p1=sc.nextInt();
     System.out.println("Enter the second product price :");
     int p2=sc.nextInt();
     System.out.println("Enter the third product price :");
     int p3=sc.nextInt();
     int TotalPrice=p1+p2+p3;
     System.out.println("The total price of the product :"+TotalPrice);
     float offer1=(float)(TotalPrice*0.2); 
     System.out.println("The Offer 1 price is: "+offer1);
     if(p1>p2 && p3>p2)
     {
    	System.out.println("The offer 2 price is :"+p2);
    	p2=offer2;
     }
     else if(p1>p3 && p2>p3)
     {
    	System.out.println("The offer 2 price is :"+p3);
    	p3=offer2;
     }
     else if(p2>p1 && p3>p1)
     {
    	System.out.println("The offer 2 price is :"+p1);
    	p1=offer2;
     }
    float pay_in_offer1 = TotalPrice-offer1;
     System.out.println("To pay in offer 1 :"+pay_in_offer1);
     
     float pay_in_offer2 = TotalPrice-offer2;
     System.out.println("To pay in offer 1 :"+pay_in_offer2);
     
     if(pay_in_offer1>pay_in_offer2)
     {
    	 System.out.println("The offer 2 is benificial for the customer");
     }
     else
     {
    	 System.out.println("The offer 1 is benificial for the customer");
     }
	}

}
