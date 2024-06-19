package week1.day3.homeassignments;

public class FindIntersection {
	
	public static void main(String[] args) {
				
		  int a[] = {3,2,11,4,6,7};
		  int[] b = {1,2,8,4,9,7};
		 		
		/*
		 * int a[] = {3,2,11,4,6,7}; int[] b = {3,11,11,7,9,7};
		 */
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if(a[i] == b[j]) {
					
					System.out.println(a[i]);
				}
				
			}
					
		}
	}

}
