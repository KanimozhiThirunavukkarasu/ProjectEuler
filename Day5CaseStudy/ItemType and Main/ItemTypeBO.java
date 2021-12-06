package Day5;
import Day5.ItemType;
import java.util.Scanner;

public class ItemTypeBO extends ItemType{

   
	Scanner sc=new Scanner(System.in);
	public void add(ItemType object ,ItemType[] itemTypeArray,Integer index){
		itemTypeArray[index]=object;
		System.out.println("New item added successfully");
		
	}
	public void search(String search, ItemType[] itemTypeArray){
		boolean found=false;

		for(int i=0;i<itemTypeArray.length;i++){
		if(itemTypeArray[i].getName().equals(search)){
		found=true;
		System.out.println("searched Item Type is:");
		System.out.println(itemTypeArray[i]);
		}
		}
		if(found==false){
		System.out.println("searched item type not found");
		}
		}
	public void display(ItemType[] itemTypeArray){
	for(int i=0;i<itemTypeArray.length;i++){
		System.out.println("Item Type Number :"+(i+1));
		System.out.println(itemTypeArray[i]);
	}
	}
}
