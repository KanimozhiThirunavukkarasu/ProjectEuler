Address :-
  
  package kanimozhi;

public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private Integer pincode;
	
	Address()
	{
		
	}
	Address(String addressLine1, String addressLine2, String city,String state, Integer pincode)
	{
		this.addressLine1=addressLine1;
		this.addressLine2=addressLine2;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String toString()
	{
		return getAddressLine1()+"\n"+getAddressLine2()+"\n"+getCity()+"\n"+getState()+"\n"+getPincode();
		
	}
}

--------------------------

AddressMain :-
  
	
  package kanimozhi;

import java.util.Scanner;

public class AddressMain extends Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Address address=new Address();
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Address Line1 :");
     address.setAddressLine1(sc.nextLine());
     System.out.println("Enter Address Line2 :");
     address.setAddressLine2(sc.nextLine());
     System.out.println("Enter City :");
     address.setCity(sc.nextLine());
     System.out.println("Enter State :");
     address.setState(sc.nextLine());
     System.out.println("Enter pincode :");
     address.setPincode(sc.nextInt());
     System.out.println("Address Details are :");
     System.out.println(address.toString());
	}

}
