ItemType.java:-

package kanimozhi;
import java.util.Scanner;


	
	public class ItemType {
		static String Item_Name;
		static double Cost_per_day;
		static double Deposit;

		public String getName() {
			return Item_Name;
		}
		public void setName(String name) {
			Item_Name = name;
		}
		public double getCost_per_day() {
			return Cost_per_day;
		}
		public void setCost_per_day(int cost_per_day) {
			Cost_per_day = cost_per_day;
		}
		public double getDeposit() {
			return Deposit;
		}
		public void setDeposit(int deposit) {
			Deposit = deposit;
		}

		public void display()
		{
         System.out.println("Enter the item details are :");
         System.out.println("Item Name :"+Item_Name);
         System.out.println("Item Cost :"+Cost_per_day);
         System.out.println("Item Deposit :"+Deposit);
         
         

		}
    
    
    
    
   ItemMain.java :-
    
    package kanimozhi;
import java.util.Scanner;
import kanimozhi.ItemType;
public class ItemMain extends ItemType{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the Item Name :");
     Item_Name=sc.nextLine();
     System.out.println("Enter the cost per day :");
     Cost_per_day=sc.nextInt();
     System.out.println("Enter the Deposit :");
     Deposit = sc.nextInt();
     ItemType it=new ItemType();
     it.display();
     
     
	}

}
