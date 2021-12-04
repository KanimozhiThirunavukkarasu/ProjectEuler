CustomerAddress.java:-
  
  package kanimozhi;

public class CustomerAddress {
	private  String Street;
	private  String city;
	private Integer pincode;
	
	 
	
		 
		 public CustomerAddress()
		 {
			
		 }
		public CustomerAddress (String street,String city,Integer pincode)
		 {
			 this.Street=street;
			 this.city=city;
			 this.pincode=pincode;
		 }
		 
		 
		 
  public  String getStreet() {
			return Street;
		}
		public  void setStreet(String street) {
			this.Street = street;
		}
		public  String getCity() {
			return city;
		}
		public  void setCity(String city) {
			this.city = city;
		}
		public  Integer getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
@Override
	public String toString() {
		return getStreet()+","+getCity()+"-"+getPincode();
	}
}


CustomerDetails:-
  
  package kanimozhi;

public class CustomerDetails {
	 static String Name;
      CustomerAddress a;
	
	CustomerDetails()
		 {
			 
		 }
	CustomerDetails (String name,CustomerAddress a)
		 {
			 this.Name=name;
			 this.a=a;
			 
		 }
	
	@Override
		 public String toString() {
				return Name+" "+" "+a.toString();
			}
	
	
		}


CustomerDetailsMAin:-
  
  package kanimozhi;

import java.util.Scanner;
import kanimozhi.CustomerAddress;
import kanimozhi.CustomerDetails;

public class CustomerDetailsMain extends CustomerDetails{
	
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CustomerAddress a = new CustomerAddress(); 
		CustomerDetails cd =new CustomerDetails(Name,a);
	   
	     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name :");
     cd.Name=sc.nextLine();
     System.out.println("Enter the Address Details :");
     System.out.println("Enter the Street :");
     a.setStreet(sc.nextLine());
     System.out.println("Enter the city :");
     a.setCity(sc.nextLine());
     System.out.println("Enter the pincode :");
     a.setPincode(sc.nextInt());
     System.out.println(cd.toString());
     
    
     
	}

}
