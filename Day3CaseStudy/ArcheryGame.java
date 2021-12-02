import java.util.Scanner;

public class ArcheryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,t=0;
     Scanner sc = new Scanner(System.in);
     int target=100;
     
     for(int i=1;i<100;i++)
     {
    	 System.out.println("Enter the turns : ");
    	 t+=sc.nextInt();
    	 c++;
    	 if(t>=100)
    	 {
    		 System.out.println("Target Reached");
    		 break;
    	 }
    	 
    	 
     }
     System.out.println("The Number of turns are :"+c);
	}

}
