import java.util.Scanner;
public class CurrencyNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n1,n2,n3,n4,n5,n6;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount:");
    int n=sc.nextInt();
    n1=n/100; n=n%100;
    n2=n/50;  n=n%50;
    n3=n/10;  n=n%10;
    n4=n/5;   n=n%5;
    n5=n/2;   n=n%2;
    n6=n;
    
    int t=n1+n2+n3+n4+n5+n6;
    System.out.println(t+" is the minimum number of currency notes");
    
	}

}
