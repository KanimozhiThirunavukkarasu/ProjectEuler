Customer1.java :-
  
  package kanimozhi;

import java.util.*;

public class Customer1 {
 

	 String Name;
	 CustomerAddress1 Address;
	
	 Customer1()
	 {
		
	 }
	 Customer1(String name,CustomerAddress1 address)
	 {
		 this.Name=name;
		 this.Address=address;
		 
	 }
	 
	 public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public CustomerAddress1 getAddress() {
		return Address;
	}
	public void setAddress(CustomerAddress1 address) {
		Address = address;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Customer1 other = (Customer1) obj;
		return Objects.equals(Name, other.Name) && this.Address.equals(other.getAddress());
	}
	@Override
	public String toString() {
		return "Name: " + Name + "\n Address:" + Address.toString();
	}
 }
 
 
----------------------------------
  CustomerAddress1.java :-
    
    package kanimozhi;

import java.util.*;


public class CustomerAddress1 {
	
		private String Street;
		 private String city;
		 private int pincode;
		 CustomerAddress1()
		 {
			
		 }
		 CustomerAddress1 (String street,String city,int pincode)
		 {
			 this.Street=street;
			 this.city=city;
			 this.pincode=pincode;
		 }
		 
		 
		 public String getStreet() {
			return Street;
		}
		public void setStreet(String street) {
			Street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			CustomerAddress1 otheraddress = (CustomerAddress1) obj;
			return Objects.equals(city, otheraddress.city) && Objects.equals(pincode, otheraddress.pincode)
					&& Objects.equals(Street, otheraddress.Street);
			}
		
		@Override
		public String toString() {
			return Street + "," + city + "-" + pincode;
		}

		 
	 }


-----------------------------
  CustomerMain1.java :-
    
    package kanimozhi;
import java.util.*;
public class CustomerMain1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer1[] c =new Customer1[100];
		Customer1[] dc = new Customer1[100];
		Customer1 c1 = null;
		CustomerAddress1 a = null;
		int count = 0,dcount = 0,i=0,j;

		
			System.out.println("Enter the number of customers");
			count = sc.nextInt();

			while (i < count) {
				c1 = new Customer1();
				a = new CustomerAddress1();

				System.out.printf("Enter the Customer Details %d \n", i + 1);
				System.out.println("Enter the name");
				c1.setName(sc.next());

				System.out.println("Enter the street");
				a.setStreet(sc.next());

				System.out.println("Enter the city");
				a.setCity(sc.next());

				System.out.println("Enter the pincode");
				a.setPincode(sc.nextInt());

				c1.setAddress(a);
				c[i] = c1;
				i++;

			} 

			for (i = 0; i < count; i++) {
				for ( j = i + 1; j < count; j++) {
					if (c[i].equals(c[j])) {
						dc[dcount++] = c[i];
					}
				}
			}

			if (dc[0] == null) {
				System.out.println("No duplicate details");
			} else {
				System.out.println("The identical Customers Details:");

				for (i = 0; i < dcount; i++) {
					System.out.println((i + 1) + ")" + dc[i]);
				}
			}

		}
	}






  
  
