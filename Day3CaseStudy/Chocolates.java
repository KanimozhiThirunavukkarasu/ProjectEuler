import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int c=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of chocolates :");
    int choco = sc.nextInt();
    System.out.println("Enter the number of children :");
    int child = sc.nextInt();
    for(int i=1;i<=child;i++)
    {
    	if(choco>=i){
    		choco=choco-i;
    	    c++;
    	}
    }
    System.out.println("The chocolotes remaining is :"+choco);
    System.out.println("Number of children got the chocolates : "+c);
	}

}
