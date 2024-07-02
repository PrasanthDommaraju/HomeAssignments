package week2.day4homeassignments;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {
	
	//finding the intersection within two arrays using List
	
	public static void main(String[] args) {
		
		//declaring arrays using List
		List<Integer> array1 = new ArrayList<Integer>();
		
		List<Integer> array2 = new ArrayList<Integer>();
		
		//Adding values to arrays
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		
		System.out.println("Array1 : "+array1);
		System.out.println("Array2 : "+array2);
		
		//comparing the two Array List to get the matching values
		for (int i = 0; i < array1.size(); i++) {
			
			for (int j = 0; j < array2.size(); j++) {
				
				if(array1.get(i)==array2.get(j)) {
					System.out.print(array1.get(j)+" ");
				
				}
	     }
	}
		
	}

}
