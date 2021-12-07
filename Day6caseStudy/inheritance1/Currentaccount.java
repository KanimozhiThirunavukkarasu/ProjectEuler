package Day6;

public class CurrentAccount extends Account{
 private String pinNumber;
 
 CurrentAccount()
 {
	 
 }
 CurrentAccount(String accName,String accNo,String bankName,String pinNumber)
 {
	 super();
	 this.accName=accName;
	 this.accNo=accNo;
	 this.bankName=bankName;
	 this.pinNumber=pinNumber;
	 
 }
public String getPinNumber() {
	return pinNumber;
}
public void setPinNumber(String pinNumber) {
	this.pinNumber = pinNumber;
}
 
 public void display(){
	 System.out.println("Pin Number :"+pinNumber);
 }
/* @Override
 public String toString(){
	 return "AccountName:"+accName+"\n Account Number :"+accNo+"\n Bank Name :"+bankName+"\n Pin Number :"+pinNumber;
 }*/
}
