public class Pythagorean {
   
	static int a,b,c;
	static int num=1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	for(a=1;a<num;a++){
	for(b=a+1;b<num;b++){
		for(c=b+1;c<num;c++){
			if (((a*a + b*b == c*c) && ((a+b+c) ==1000))) {
			    System.out.println("a="+a+", b="+b+ ", c="+c);
			    System.out.println(a+b+c);
			    System.out.println("The product of the number is :"+(a*b*c));
			    }
			   }
			  }
			 }
	

	}
	
}
