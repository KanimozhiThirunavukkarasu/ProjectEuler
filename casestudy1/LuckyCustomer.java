import java.util.Scanner;

public class LuckyCustomer {
	static int a,b,x,y;
	static int bill,date;
	Scanner sc = new Scanner(System.in);
	
	void findluckycustomer()
	{
		System.out.println("Enter the date:");
	    date= sc.nextInt();
	    
		a=date%10;
		b=date%100;
		x=bill%10;
		y=bill%100;
		
		if(date>0 && date<32)
		{
			System.out.println("Enter the Bill Number:");
			 bill=sc.nextInt();	
		if((a==x||b==y)&&(bill%date==0))
			System.out.println("Customer is a lucky customer ");
		else
			System.out.println("Customer is not a lucky customer");
		}
		else
		{
			System.out.println("Date is not valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LuckyCustomer lc=new LuckyCustomer();
     lc.findluckycustomer();
	}
