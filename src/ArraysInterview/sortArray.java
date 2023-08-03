package ArraysInterview;

public class sortArray {
	
	public static void main(String[] args) {
		int arr[] = {23,12,43,32,65,41};
		sort(arr);
		String s = "race";
		sortChar(s);
	}

	
	public static void sort(int arr[]) {
		int counter =0, counter1 =0;
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
			//arr[counter1++] = arr[j];
			System.out.println(arr[j]);
		}
	
	}
	
	public static void sortChar(String s) {
		
		char ch[] = s.toCharArray();
		int counter =0;
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			ch[counter++] = ch[i];
		}
		
		System.out.println(String.valueOf(ch));
	
	}
	
}
