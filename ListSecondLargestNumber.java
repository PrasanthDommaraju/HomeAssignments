package week2.day4homeassignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListSecondLargestNumber {
	
	public static void main(String[] args) {
		
		//declaring the array and adding values
		List<Integer> list1  = new LinkedList<Integer>();
		
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		System.out.println("List : "+list1);
		
		//sorting the list
		Collections.sort(list1);
		
		System.out.println("List after sorting : "+list1);
		
		//getting the second largest number from the list
		Integer secLargest = list1.get(list1.size()-2);
		
		System.out.println("The second largest number in the list is "+"\""+secLargest+"\"");
			
		}
		
}
