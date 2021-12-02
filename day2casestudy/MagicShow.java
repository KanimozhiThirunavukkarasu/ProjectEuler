import java.util.Scanner;
public class MagicShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the number of people who watched show 1:");
     int show1=sc.nextInt();
     System.out.println("The Average rating for show1:");
     float avg1=sc.nextFloat();
     
     System.out.println("Enter the number of people who watched show 2:");
     int show2=sc.nextInt();
     System.out.println("The Average rating for show2:");
     float avg2=sc.nextFloat();
     
     System.out.println("Enter the number of people who watched show 3:");
     int show3=sc.nextInt();
     System.out.println("The Average rating for show3:");
     float avg3=sc.nextFloat();
     
     float OverallAvg=((show1*avg1)+(show2*avg2)+(show3*avg3))/(show1+show2+show3);
     System.out.printf("The Overall average rating for the show : %.2f\n",OverallAvg);
    
     
	}

}
