package Day5;

import java.util.Scanner;
import Day5.User;
public class UserMain extends UserBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserBO userBO = new UserBO();
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of User :");
	    int n=sc.nextInt();
	    User user[]=new User[n];
	    User userIns=new User();
	    for(int i=0;i<n;i++){
	    System.out.println("Enter the  Name of the user :"+" "+(i+1));
	    userIns.setName(sc.next());
	    System.out.println("Enter the the mobilenumber of the user :");
	    userIns.setMobileNumber(sc.next());
	    System.out.println("Enter the username of the user :");
	    userIns.setUsername(sc.next());
	    System.out.println("Enter the password of the user :");
	    userIns.setPassword(sc.next());
	   // user[i]=new User(userIns.getName(),userIns.getMobileNumber(),userIns.getUsername(),userIns.getPassword());
	    userBO.addUser(user,userIns);
	    }
	    
	    System.out.println("User details as entered :");
	    userBO.displayAll(user);
	    	
	    
	    System.out.println("After Sorting :");
	    
	    userBO.sortUsers(user);
	    System.out.println("Enter the user to be deleted :");
	    String name=sc.next();
	     userBO.deleteUser(user, name);
	    System.out.println("User deleted successfully....");
	    System.out.println("After Deleting");
	    
	   
	    
	    	userBO.displayAll(user);
	
	}

}
