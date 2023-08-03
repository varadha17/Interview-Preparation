package StringQuestions;

public class anagram {
	
	public static void main(String[] args) {
		String s = "acer";
		String s1 = "race";
		String one = check(s);
		String two = check(s1);
		
		if(one.equals(two)) {
			System.out.println("anagram");
		} else System.out.println("Not a anagram");
	}
	
	public static String check(String s) {
		
		char ch[] = s.toCharArray();
		int count = 0;
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			ch[count++] = ch[i];
		}
		
		String val = String.valueOf(ch);
		return val;
	}

}
