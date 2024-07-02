package week2.day4homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {
	
	public static void main(String[] args) {
		
		String array[] = new String[] {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> names = new ArrayList<String>();
		
		names.addAll(Arrays.asList(array));
		
		//declaring the List Array with values
//		List<String> names = new ArrayList<String>(Arrays.asList("HCL", "Wipro", "Aspire Systems", "CTS"));
				
		List<String> reverse = new ArrayList<String>();
		
		System.out.println("The array list before sorting : "+names);
		
		//sorting the array list
		Collections.sort(names);
		
		System.out.println("The array list after sorting : "+names);
		
		//printing the Array list in reverse order
		for (int i = names.size()-1; i >=0; i--) {
			reverse.add(names.get(i));
		}
		
		System.out.println("The array list after reversing : "+reverse);
	}

}
