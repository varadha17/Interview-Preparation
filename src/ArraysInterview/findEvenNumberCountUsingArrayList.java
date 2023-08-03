package ArraysInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class findEvenNumberCountUsingArrayList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array");
		int n = sc.nextInt();
		
		Integer[] arr = new Integer[n];
		System.out.println("array");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(val(arr));
	}
	
	public static int val(Integer arr[]) {
		
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(arr));
		
		int count = 0;
		for(Integer i: li) {
			if(i%2==0) {
				count++;
			}
		}
		return count;
	}

}
