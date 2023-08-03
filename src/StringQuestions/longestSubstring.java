package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {
	
	public static void main(String[] args) {
		lengthofLongestSubstring("varadharajan");
	}
	
	public static void lengthofLongestSubstring(String s) {
		Map<Character,Integer> map = new HashMap<>();
		
		int maxLength = 0;
		int start = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(map.containsKey(ch)) start = Math.max(start, map.get(ch)+1);
			
			map.put(ch, i);
			maxLength = Math.max(maxLength, i-start+1);
		}
		
		System.out.println(maxLength);
	}

}
