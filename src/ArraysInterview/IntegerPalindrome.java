package ArraysInterview;

public class IntegerPalindrome {
	//mmd
	
	public static void main(String[] args) {
		mmd(123);
	}
	
	public static void mmd(int m) {
		int remainder, reverse = 0;
		
		while(m != 0) {
			remainder = m%10;
			reverse = reverse*10+remainder;
			m = m/10;
		}
		
		System.out.println(reverse);
	}

}
