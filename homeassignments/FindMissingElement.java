package week1.day3.homeassignments;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,3,2,8,6,7};
		//int arr[] = {1,5,3,2,8,6,7};
		//int arr[] = {0,4,3,2,8,6,5};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			 
			if(arr[i] != i+1) {
				System.out.println(i+1);
				break;
			}
			
		}
	}

}
