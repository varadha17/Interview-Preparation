package patternProgram;

public class pattern {
	
	public static void main(String[] args) {
//		rectangle(0,5);
//		traingle(0,6);
//		reverseTraingle(0,6);
		rightPyramid(0,6);
	}
	
	public static void rectangle(int start, int end) {
		for(int row=start; row<end; row++) {
			for(int col=start; col<end; col++) {
				if(row==start||row==end-1||col==start||col==end-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void traingle(int start, int end) {
		for(int row=start; row<end; row++) {
			for(int col=start; col<=row; col++) {
				System.out.print(col+1);
			}
			System.out.println();
		}
	}
	
	public static void reverseTraingle(int start, int end) {
		for(int row=end-1; row>=0; row--) {
			for(int col=row; col>=start; col--) {
				System.out.print(col+1);
			}
			System.out.println();
		}
	}
	
	public static void rightPyramid(int start, int end) {
		for(int row=start; row<end; row++) {
			for(int col=end-1; col>=start; col--) {
				if(row==end-1||row==start||col==end-1||col==start) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
