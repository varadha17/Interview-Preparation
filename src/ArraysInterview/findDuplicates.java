package ArraysInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class findDuplicates {
	
	public static void main(String[] args) {
		Integer arr[]= {23,34,23,45,12,45,34,1,2,3};
		int arr1[]= {1,3,2,3,1,4,5,5};
		duplicates(arr);
		findDuplicateElements(arr1);
	}
	
	public static void duplicates(Integer arr[]) {
		
		ArrayList<Integer> li = new ArrayList<>(Arrays.asList(arr));
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		
		for(Integer i : li) {
			if(!set.add(i)) {
				set1.add(i);
			}
		}
		
		for(Integer i1: set1) {
			System.out.print(i1+" ");
		}
		
	}
	
	public static void findDuplicateElements(int arr[]) {
		Arrays.sort(arr);
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				arr[count++] = arr[i];
			}
		}
		
		//arr[count++] = arr[arr.length-1];
		
		for(int i=0; i<count;i++) {
			System.out.println(arr[i]);
		}
	}

}
