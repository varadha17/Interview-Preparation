package StringQuestions;


public class reverseStringArray {
	
	public static void main(String[] args) {
		char ch[] = {'H','n','a','a','h'};
		reverse(ch);
	}
	
	//this program is like preserving positions
	public static void reverse(char[] s) {
		int i = 0;
        int j = s.length - 1;
        
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
        System.out.println(s);
	}

}
