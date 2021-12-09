package Day8;

import java.util.Scanner;

public class EventMain {

     public static void main(String args[]){
    Exhibition e=new Exhibition();
      StageEvent s=new StageEvent();
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name of the event: ");
      String name=sc.nextLine();
      System.out.println("Enter the detail of the event: ");
      String detail=sc.nextLine();
      System.out.println("Enter the owner name of the event: ");
      String owner=sc.nextLine();
      System.out.println("Enter the type of the event: \n 1.Exhibition \n 2.StageEvent ");
      
      int n=sc.nextInt();
      
     if(n==1){
       System.out.println("Enter the number of stalls:");
       Integer stall=sc.nextInt();
       e.setNoOfStalls(stall);
       System.out.println("The projected revenue of the event is "+e. projectedRevenue());
     }
       
     else{
       System.out.println("Enter the number of shows: ");
       Integer shows=sc.nextInt();
       System.out.println("Enter the number of seats per show: ");
       Integer seats=sc.nextInt();
       s.setNoOfShows(shows);
       s.setNoOfSeatsPerShow(seats);
       System.out.println("The projected revenue of the event is "+s. projectedRevenue());
      }
     }

    }

 

 

 
