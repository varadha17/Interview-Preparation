package ArraysInterview;

public class MissingElements {
	
	public static void main(String[] args) {
		int arr[] = {20,25,30,35};
		missing(arr);
	}
	
	public static void missing(int arr[]) {
		int count = 0;
		for(int i=arr[0]; i<arr[arr.length-1];i++) {
			if(arr[count] == i) count++;
			else System.out.print(i+" ");
		}
	}

}
