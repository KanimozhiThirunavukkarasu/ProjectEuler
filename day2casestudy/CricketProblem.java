public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the total number of overs:");
    int TotalNumberOfOvers=sc.nextInt();
    System.out.println("Enter the Target runs:");
    int Targetruns=sc.nextInt();
    System.out.println("Enter the overs bowled:");
    int oversbowled=sc.nextInt();
    System.out.println("Enter the runs scored:");
    int runsscored=sc.nextInt();
    
    float runrate = runsscored/oversbowled;
    System.out.printf("Current run rate : %.2f\n",runrate);
    
    double runraterequired =(double)(Targetruns-runsscored) /(TotalNumberOfOvers-oversbowled);
    System.out.printf("Run rate required after 10 overs : %.2f\n",runraterequired);
	}

}
