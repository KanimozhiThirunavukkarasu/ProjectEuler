import java.util.Scanner;

public class SumSquaresDifferent {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number :");
     int n=sc.nextInt();
     
     int square_of_sum=(int) Math.pow((n*(n+1)/2), 2);
     System.out.println("The square of the sum is "+square_of_sum);
     
     int sum_of_square=((n*(n+1)*((2*n)+1)))/6;
     System.out.println("The sum of the square is "+sum_of_square);
     
     int diff=(int) (square_of_sum-sum_of_square);
     System.out.println("The difference of the square of the sum and sum of the square : "+diff);
	}

}
