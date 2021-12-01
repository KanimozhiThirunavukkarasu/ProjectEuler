public class LargestPrimeFactor {
	
   public static long largestPrimeFactor(long a){
	    int i = 2;
	    while(i != a){
	      if(a%i == 0)
	        a = a/i;
	      else 
	        i++;
	    }
	    return a;
	  }
	public static void main(String[] args) {
	
     System.out.println("The largest prime factor of the given number :"+largestPrimeFactor(600851475143L));
      
	}

}
