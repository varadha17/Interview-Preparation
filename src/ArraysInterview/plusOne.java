package ArraysInterview;

public class plusOne {
	
	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4,8};
		plus(arr);
	}
	
	public static void plus(int arr[]) {
		StringBuilder s = new StringBuilder();
		for(int i: arr) {
			s.append(i);
		}		
		int n = Integer.parseInt(s.toString())+1;
		System.out.println(n);
	}

}
