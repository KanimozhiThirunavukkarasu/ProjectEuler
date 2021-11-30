import java.util.Scanner;

public class EvenFibanocciSeries {
static int x=0;
static int y=1;
int z;
int sum;

	void fib()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		for (int i=2;i<=n;i++)
		{
			z=x+y;
			x=y;
			y=z;
			if(z%2==0 && z<=4000000)
			{
				sum+=z;
			}
			System.out.println(z);
		}
		System.out.println("The sum of even fibanocci :"+sum);	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EvenFibanocciSeries fb = new EvenFibanocciSeries();
     fb.fib();
	}

}
