
package Day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EventMain {
    public static void main(String[] args) throws Exception  {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Exhibition exhib=new Exhibition();
        StageEvent stage=new StageEvent();
        String[] exhibition,stageevent;
        
        long diffinMilles,difference;
        Double cost,gst;
        
        System.out.println("Enter your choice:");
        System.out.println("1.Exhibition event\r\n" + 
                "2.Stage event");
        int choice=sc.nextInt();
        
        if(choice==1)
            {
            System.out.println("Enter the details of exhibition:");
        String Array = sc.next();
        String[] res=Array.split(",");
        String name = res[0];
        String details = res[1];
        String Type = res[2];
            String overname=res[3];
            String noOfStall=res[4];
        System.out.println("Enter the starting date of the event:");
        Date startdate = new SimpleDateFormat("dd-MM-yyyy").parse(sc.nextLine());
        System.out.println("Enter the ending date of the event:");
        Date enddate = new SimpleDateFormat("dd-MM-yyyy").parse(sc.nextLine());
        
        diffinMilles=(enddate.getTime())-(startdate.getTime());
        difference=TimeUnit.DAYS.convert(diffinMilles, TimeUnit.MILLISECONDS);
        cost=exhib.getCostPerDay()*difference;
        gst=cost*(0.005*exhib.getNoOfStall());
        System.out.println("The GST to be paid is Rs."+gst);}
        
        else{
            System.out.println("Enter the details of stage event:");
        }
        String Array = sc.next();
        String[] res1=Array.split(",");
        String name = res1[0];
        String details = res1[1];
        String Type = res1[2];
            String overname=res1[3];
            String noOfStages=res1[4];
        System.out.println("Enter the starting date of the event:");
        Date startdate1 = new SimpleDateFormat("dd-MM-yyyy").parse(sc.nextLine());
        System.out.println("Enter the ending date of the event:");
        Date enddate1 = new SimpleDateFormat("dd-MM-yyyy").parse(sc.nextLine());
        
        diffinMilles=(enddate1.getTime())-(startdate1.getTime());
        difference=TimeUnit.DAYS.convert(diffinMilles, TimeUnit.MILLISECONDS);
        cost=stage.getCostPerDay()*difference;
        gst=cost*(0.15*stage.getNoOfSeats());
        System.out.println("The GST to be paid is Rs."+gst);
        }
    

 

}

 
