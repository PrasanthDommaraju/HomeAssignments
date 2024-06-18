package week1.day2.homeassignments;

public class IsPrime {
	
	public static void main(String[] args) {
		
		/*
		 * //Prime number is divisible by itself and 1 Any natural number is divisible
		 * only by itself, and 1 is called a prime number. In other words, prime numbers
		 * have just two factors, i.e. 1 and number itself.
		 */
	
	int n = 7,count = 0;
	
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				System.out.println("The number " + i +" is not a Prime number");
				count = 1;
				break;
			}
           if (count == 0) {
				
				System.out.println("The number " + i +" is a Prime number");
		}
			
	}
				
		
				 
		
	}
	
}
