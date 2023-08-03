package ArraysInterview;

public class reverseEachInteger {

	public static void main(String[] args) {
		int arr[] = {12,23,24,25};
		arrayReverse(arr);
	}
	
	public static void arrayReverse(int arr[]) {
		int count =0;
		for(int i=0; i<arr.length-1;i++) {
			arr[count++] = reverse(arr[i]);
		}
		arr[count] = reverse(arr[arr.length-1]);
		for(int j=count; j>=0; j--) {
			System.out.println(arr[j]);
		}
		
		
	}
	
	public static int reverse(int num) {
		int remainder, reverse = 0;
		
		while(num != 0) {
			remainder = num%10;
			reverse = reverse*10+remainder;
			num = num/10;
		}
		
		return reverse;
	}
}


