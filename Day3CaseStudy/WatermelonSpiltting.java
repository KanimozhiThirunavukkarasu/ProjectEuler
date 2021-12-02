import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the weight of the watermelon that you got:");
   int weight=sc.nextInt();
   if(weight%2!=0)
   {
	   System.out.println("Sorry ! you can't able buy the watermelon....");
   }
   else
   {
	   for(int i=1;i<=weight;i++)
	   {
		   System.out.println("Possible ways of spiltting are :"+i+" "+(weight-i));
	   }
   }
	}

}
