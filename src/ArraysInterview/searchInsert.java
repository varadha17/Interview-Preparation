package ArraysInterview;

import java.util.Arrays;

public class searchInsert {
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,5};
		System.out.println(search(arr,7));
	}
	
	// if the target value present in the array then return that position of the element
	// if not where the element will be suited in the array return the position of the element
	public static int search(int arr[], int target) {
		int arrnew[] = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}else{
				arrnew[i] = arr[i];
				arrnew[arr.length] = target;
			}
			
		}
		
		Arrays.sort(arrnew);
		for(int j=0; j<arrnew.length; j++) {
			if(arrnew[j] == target) {
				return j;
			}
		}
		return target;
	}

}
