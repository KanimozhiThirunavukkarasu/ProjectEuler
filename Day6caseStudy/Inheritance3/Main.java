package Day6;

import java.util.Scanner;

import Day6.SilverStall;

public class StallMain extends PlatinumStall {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Choose Stall Type : \n 1.Silver Stall \n 2.Gold Stall \n 3.Platinum Stall");
        int n=sc.nextInt();
        
        if(n==1)
        {
            
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost");
            String Array = sc.next();
            String[] res1=Array.split(",");
            String name = res1[0];
            String detail = res1[1];
            String owner = res1[2];

            int cost = Integer.parseInt(res1[3]);
            SilverStall ss = new SilverStall(name, detail,owner, cost);
            System.out.println(ss.toString());
        }
        else if(n==2)
        {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost");
            String Array = sc.next();
            String[] res1=Array.split(",");
            String name = res1[0];
            String detail = res1[1];
            String owner = res1[2];

            int cost = Integer.parseInt(res1[3]);
            int tvSet = Integer.parseInt(res1[4]);
            SilverStall ss = new SilverStall(name, detail,owner, cost);
            System.out.println(ss.toString());
            GoldStall gs = new GoldStall( name,  detail,  owner,  cost,  tvSet);
            System.out.println(gs.toString());
        }
        else
        {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
            String Array = sc.next();
            String[] res1=Array.split(",");
            String name = res1[0];
            String detail = res1[1];
            String owner = res1[2];

            int cost = Integer.parseInt(res1[3]);
            int tvSet = Integer.parseInt(res1[4]);
            int projector = Integer.parseInt(res1[5]);
            SilverStall ss = new SilverStall(name, detail,owner, cost);
            System.out.println(ss.toString());
            PlatinumStall ps = new PlatinumStall( name,  detail,  owner,  cost,  tvSet,projector);
            System.out.println(ps.toString());
        }
    }

}
