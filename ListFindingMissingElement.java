package week2.day4homeassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFindingMissingElement {
	
	public static void main(String[] args) {
		
		//declaring List array with values
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,10,6,8));
		
		//sorting the List Array
		Collections.sort(list);
		
		System.out.println("List Array after sorting :"+list);
		
		//finding the missing elements
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
