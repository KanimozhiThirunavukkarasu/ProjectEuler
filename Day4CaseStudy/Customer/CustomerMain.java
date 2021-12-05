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
