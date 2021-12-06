package Day5;

import java.util.Scanner;
import Day5.ItemTypeBO;
public class Main extends ItemTypeBO{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemTypeBO itemType = new ItemTypeBO();
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of ItemType :");
    int n=sc.nextInt();
    ItemType itemTypeArray[]=new ItemType[n];
    for(int i=0;i<n;i++){
    System.out.println("Enter the Item Type  Name :"+" "+(i+1));
    String name=sc.next();
    System.out.println("Enter the Item Type  deposit :");
    double deposit=sc.nextDouble();
    System.out.println("Enter the Item Type  costPerDay :");
    double CostPerDay=sc.nextDouble();
    itemTypeArray[i]=new ItemType(name,deposit,CostPerDay);
    itemType.add(itemTypeArray[i],itemTypeArray,i);
    }
    itemType.display(itemTypeArray);
    System.out.println("Enter the Name of the item to be searched :");
    String search =sc.next();
	itemType.search(search, itemTypeArray);
	}
	
}
