package ArraysInterview;

import java.util.Arrays;

public class removeElement {

	public static void main(String[] args) {
		int arr[] = {0,1,2,2,3,0,4,2};
		remove(arr,2);
	}
	
	public static void remove(int arr[], int value) {
		Arrays.sort(arr);
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != value) {
				arr[count++] = arr[i];
			}
		}
		//arr[count++] = arr[arr.length-1];
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(count);
	}
	
	
}
