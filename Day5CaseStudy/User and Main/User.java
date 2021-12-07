
package Day5;

public class User implements Comparable<User>{
 private static String name;
 private String mobileNumber;
 private String Username;
 private String password;
 
 User(){
	 
 }
 
 public User(String name, String mobileNumber, String username, String password){
	 this.name=name;
	 this.mobileNumber=mobileNumber;
	 this.Username=username;
	 this.password=password;
 }
 
 
 public static String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getUsername() {
	return Username;
}

public void setUsername(String username) {
	Username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
 public String toString()
 {
	 return "name : \n"+name+"mobileNumber :\n"+mobileNumber+"Username :\n"+Username+"password :\n"+password;
 }

@Override
public int compareTo(User user) {
	return this.name.compareTo(user.name);
}


}

