package week1.day2.homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		/*
		 /*Assignment Details: To find Fibonacci Series for a given range input(range):
		 * 8 Requirements: User input for the desired range of the Fibonacci series.
		 * Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2,
		 * 3, 5, 8, and 13
		 * a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
		 * The simplest is the series 1, 1, 2, 3, 5, 8, etc.
		 */
		
		int prev = 0,next = 1,range = 8, fs;
		
		System.out.print(prev+", "+next);
		
		for (int i = 2; i < range; i++) {
			
			fs = prev + next;
			
			System.out.print(", "+fs);
						
			prev = next;
			
			next = fs;
			
					
					}

	}

}
