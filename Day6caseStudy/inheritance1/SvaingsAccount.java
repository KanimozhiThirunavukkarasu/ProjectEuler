package Day6;

public class SavingsAccount extends Account{

	private String orgName;
	
	SavingsAccount(){
		
	}
	SavingsAccount(String accName,String accNo,String bankName,String orgName){
		super();
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		
		this.orgName=orgName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public void display()
	{
		 System.out.println("Organisation Name :"+orgName);

	}
	/*@Override
	 public String toString(){
		 return "AccountName:"+accName+"\n Account Number :"+accNo+"\n Bank Name :"+bankName+"\n Organisation Name:"+orgName;
	 }*/
}
