package Day5;

public class ItemType {
   private String name;
   private double deposit;
  private double costPerDay;
   
   ItemType()
   {
	   name="";
	   deposit=0;
	   costPerDay=0;
   }
   ItemType( String name, double deposit,double costPerDay)
   {
	   this.name=name;
	   this.deposit=deposit;
	   this.costPerDay=costPerDay;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getDeposit() {
	return deposit;
}
public void setDeposit(double deposit) {
	this.deposit = deposit;
}
public double getCostPerDay() {
	return costPerDay;
}
public void setCostPerDay(double costPerDay) {
	this.costPerDay = costPerDay;
}

@Override
public String toString(){
return "Name :"+name +"\n " +"Deposit :"+deposit +"\n"+"CostPerDay :"+costPerDay;
}
   
}
