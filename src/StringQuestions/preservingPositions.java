package StringQuestions;

public class preservingPositions {
	
	public static void main(String[] args) {
		String s = "varadharajan is a good boy";
		pos(s);
	}
	
	static void pos(String s) {
		//two pointer
		int start = 0, end = s.length()-1;
		char ch[] = s.toCharArray(); 
		
		while(start<end) {
			if(ch[start] == ' ') {
				start++;
				continue;
			} else if(ch[end]==' ') {
				end--;
				continue;
			}else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}
		
		System.out.println(String.valueOf(ch));
	}

}
