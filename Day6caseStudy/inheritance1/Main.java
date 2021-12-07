package Day6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account a = new Account();
    CurrentAccount ca = null;
    SavingsAccount sa = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose Account Type : \n 1.Savings Account \n 2.Current Account ");
    int n=sc.nextInt();
    
    
    if(n==1){
    	System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,PIN Number");
        String Array = sc.next();
        String[] res=Array.split(",");
        String accName = res[0];
        String accNo = res[1];
        String bankName = res[2];
        String orgName=res[3];
        sa=new SavingsAccount(accName,accNo,bankName,orgName);
    	a.display();
    	sa.display();
    	}
    else
    {System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,PIN Number");
    String Array = sc.next();
    String[] res=Array.split(",");
    String accName = res[0];
    String accNo = res[1];
    String bankName = res[2];
    	String pinNumber=res[3];
    	ca=new CurrentAccount(accName,accNo,bankName,pinNumber);
    	a.display();
    	ca.display();
    	
    }
	}

}
