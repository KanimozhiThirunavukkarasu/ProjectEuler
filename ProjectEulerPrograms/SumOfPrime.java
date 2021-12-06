public class SumOfPrime {
	private static boolean Prime(long n) {
		int count = 0;
		long sqrt = (long)Math.sqrt(n);
		
		for(long i = 1; i <= sqrt; i++) {
			if(n % i == 0) {
				count++;
			}
			if(count > 1) {
				return false;
			}
		}
		return true;
	}
     
	public static void main(String[] args) {
		long sum = 0;
		for(long i = 2; i < 2000000; i++) {
			if(Prime(i)) {
				sum += i;
			}
		}
		System.out.println("The sum of prime "+sum);
	}
	
	

}
