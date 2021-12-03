import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position to find its respective prime number ");
        n=sc.nextInt();
		
		int number=1,count=0,i;

		while(count<n)
		{
		number=number+1;
		for( i=2;i<=number;i++){
		if(number%i==0){
		break;
		}
		}
		if(i==number){
		count=count+1;
		}
		}
		System.out.println("The prime number at the"+n+"th position is"+number);
		}

		}

