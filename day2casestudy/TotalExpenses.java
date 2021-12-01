public class TotalExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter branding expenses:");
    int brandingexpense = sc.nextInt();
    System.out.println("Enter travel expenses:");
    int travelexpense = sc.nextInt();
    System.out.println("Enter food expenses:");
    int foodexpense = sc.nextInt();
    System.out.println("Enter logistics expenses:");
    int logisticsexpense = sc.nextInt();
    
    float TotalExpenses = (float)(brandingexpense+travelexpense+foodexpense+logisticsexpense);
    System.out.printf("TotalExpenses :%.2f\n",TotalExpenses);
    
    float brandingexpensepercentage =(float)(( brandingexpense/TotalExpenses )*100);
    System.out.printf("Branding expenses percentage: %.2f\n",brandingexpensepercentage);
    
    float travelexpensepercentage =(float)(( travelexpense/TotalExpenses )*100);
    System.out.printf("Travel expenses percentage: %.2f\n",travelexpensepercentage);
    
    float foodexpensepercentage =(float)(( foodexpense/TotalExpenses )*100);
    System.out.printf("Food  expenses percentage:%.2f\n",foodexpensepercentage);
    
    float logisticsexpensepercentage =(float)(( logisticsexpense/TotalExpenses )*100);
    System.out.printf("Logistics expenses percentage:%.2f\n",logisticsexpensepercentage);
    
	}

}
