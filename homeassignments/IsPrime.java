package week1.day2.homeassignments;

public class IsPrime {
	
	public static void main(String[] args) {
		
		/*
		 * //Prime number is divisible by itself and 1 Any natural number is divisible
		 * only by itself, and 1 is called a prime number. In other words, prime numbers
		 * have just two factors, i.e. 1 and number itself.
		 */
		
		//logic to check number is prime or not, prime number starts from 2
	
	int checkPrime = 23;
	
	//boolean flag = true;
	//boolean flag = false;
	 int count = 0;
	
		for(int i = 2; i < checkPrime; i++) {
			if(checkPrime%i==0) {
				//flag=false; //if the number is not prime, flag will be set to false
				//flag=true;
				count = 1;
				break;
			}
		}
           //if(flag==true) {
		     //if(flag==false) {
		    if(count==0) {
				System.out.println("The given number " + checkPrime +" is a Prime number");
		} else {
			System.out.println("The given number " + checkPrime +" is not a Prime number");
	}
		
				
	}
	
}
