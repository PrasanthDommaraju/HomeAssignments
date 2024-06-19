package week1.day2.homeassignments;

public class IntegerPalindrome {

	public static void main(String[] args) {
		
		int input = 13931;
		
		 int output = 0;
		 
		 for (int i = input; i > 0; i = i/10) {
			 int rem = i%10;
			 output = (output*10) + rem;
			 	
		 }
		 if (input==output ) {
			 System.out.println("The input is "+input+" and output is "+output+", hence it is a Palindrome");
		 } else {
			 System.out.println("The input is "+input+" and output is "+output+", hence it is not a Palindrome");
		 }
			

	}

}
