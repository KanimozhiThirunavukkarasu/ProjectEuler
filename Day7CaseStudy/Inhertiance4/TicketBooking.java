package Day8;

public class TicketBooking {
 private String StageEvent;
 private String Customer;
 private Integer noOfSeats;
 
 TicketBooking(){
     
 }
 TicketBooking(String stageEvent, String customer, Integer noOfSeats){
     this.StageEvent=stageEvent;
     this.Customer=customer;
     this.noOfSeats=noOfSeats;
     
 }
public String getStageEvent() {
    return StageEvent;
}
public void setStageEvent(String stageEvent) {
    StageEvent = stageEvent;
}
public String getCustomer() {
    return Customer;
}
public void setCustomer(String customer) {
    Customer = customer;
}
public Integer getNoOfSeats() {
    return noOfSeats;
}
public void setNoOfSeats(Integer noOfSeats) {
    this.noOfSeats = noOfSeats;
}
@Override
public String toString()
{
    return "StageEvent :"+StageEvent+"\n Customer :"+Customer+"\n Number of seats :"+noOfSeats; 
}
public void makepayment(Double amount){
    
    System.out.println("Amount "+amount+" paid in cash");
    
}
public void makePayment(String walletNumber , Double amount){
    
    System.out.println("Amount "+amount+" paid using "+walletNumber);
}
public void makePayment(String creditCard,String ccv,String name,Double amount){
    
    System.out.println("Amount "+amount+"paid using "+creditCard+ " card CCV : "+ccv);
    
}
}
