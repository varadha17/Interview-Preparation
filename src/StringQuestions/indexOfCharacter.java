package StringQuestions;

public class indexOfCharacter {
	
	public static void main(String[] args) {
		System.out.println(nthIndexOf("varadharajan","a",3));
	}
	
	public static int nthIndexOf(String str, String subStr, int count) {
	    int ind = -1;
	    while(count > 0) {
	        ind = str.indexOf(subStr, ind + 1);
	        if(ind == -1) return -1;
	        count--;
	    }
	    return ind;
	}

}
