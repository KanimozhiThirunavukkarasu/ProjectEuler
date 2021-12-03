Customer.java:-
  
  package kanimozhi;

public class Customer {

	static String CustomerName;
	static String CustomerEmail;
	static String CustomerType;
	static String CustomerAddress;

	Customer()
	{
		CustomerName=" ";
		CustomerEmail=" ";
		CustomerType=" ";
		CustomerAddress=" ";
	}
	Customer(String Name,String Email,String Type,String Address)
	{
		super();
		this.CustomerName =Name;
		this.CustomerEmail =Email;
		this.CustomerType =Type;
		this.CustomerAddress =Address;
	}


	void displaydetails(){
		System.out.println("Name:"+CustomerName);
		System.out.println("Email :"+CustomerEmail);
		System.out.println("Type :"+CustomerType);
		System.out.println("Address : "+CustomerAddress);
	}

}





CustomerMain.java:-
  
  package kanimozhi;

import java.util.Scanner;
import kanimozhi.Customer;

public class CustomerMain extends Customer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer details :");
		System.out.println("Enter the name :");
		CustomerName=sc.next();
		System.out.println("Enter the Email :");
		CustomerEmail=sc.next();
		System.out.println("Enter the Type :");
		CustomerType=sc.next();
		System.out.println("Enter the Location :");
		CustomerAddress=sc.next();
		
		Customer c= new Customer(CustomerName,CustomerEmail,CustomerType,CustomerAddress);
		c.displaydetails();
	}

}
