package ArraysInterview;

public class findMiddleElement {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		middle(arr,0,arr.length-1);
	}
	
	public static void middle(int arr[], int start, int end) {
		int mid = start+(end-start)/2;
		System.out.println(arr[mid]);
	}

}
