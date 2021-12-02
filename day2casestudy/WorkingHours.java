import java.util.Scanner;
public class WorkingHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the total salary paid to the employee:");
     int salary=sc.nextInt();
     int Weekend_days=(salary-800)/130;
     int weekdays=(salary-(Weekend_days)*50)/80;
     System.out.println("Number of weekday hours is :"+weekdays);
     System.out.println("Number of weekend hours is :"+Weekend_days);
     
	}

}
