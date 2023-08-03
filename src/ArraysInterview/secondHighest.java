package ArraysInterview;

public class secondHighest {
	
	public static void main(String[] args) {
		int arr[] = {12,43,56,2,3,95,87,222,24,89};
		int arr1[] = {3,4,5,6};
		array(arr,2);
		
	}
	
	
	public static boolean sortedOrNot(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void array(int arr[], int n) {
		int counter=0 , counter1= 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			arr[counter++] = arr[i];
		}
		
		for(int j=arr.length-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
			arr[counter1++] = arr[j];
		}
		
		System.out.println(arr[n]);
	}

}
