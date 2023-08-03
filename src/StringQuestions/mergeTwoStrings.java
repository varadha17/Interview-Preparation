package StringQuestions;

public class mergeTwoStrings {
	
	public static void main(String[] args) {
		String s = "Autoamtion";
		String s1 = "Tester";
		merge(s,s1);
		
	}
	
	public static void merge(String s, String s1) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length() || i<s1.length(); i++) {
			if(i<s.length()) sb.append(s.charAt(i));
			if(i<s1.length()) sb.append(s1.charAt(i));
		}
		
		System.out.println(sb);
	}

}
