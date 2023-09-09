package Algorithm;

public class binarySearch {
	
	public static void main(String[] args) {
		int arr[] = {12,12,13,15,23,23,45};
		int target[] = new int[2];
		target[0] = FirstIndexsearch(arr,13);
		target[1] = LastIndexsearch(arr,12);
		
		for(int i=0; i<target.length; i++) {
			System.out.println(target[i]);
		}		
	}
	
	//if the target element is in middle then it will be terminated
	//if the target element is less than mid then search will move left
	//if the target element is greater than mid then search will move right
	public static int FirstIndexsearch(int arr[], int target) {
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			//find mid
			int mid = low+(high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(arr[mid]<target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		
		return -1;
	}
	
	public static int LastIndexsearch(int arr[], int target) {
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			//find mid
			int mid = low+(high-low)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(arr[mid]>target) {
				high = mid+1;
			}else {
				low = mid-1;
			}
		}
		
		return -1;
	}


}
