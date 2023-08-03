package StringQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class dup {
	
	public static void main(String[] args) {
		String s = "hello everyone please be quiet";
		String s1 = "This is a string";
		//dupElements(s1);
		dupElementsHighestInWord(s);
	}
	
	public static void dupElements(String s) {
		char[] ch = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: ch) {
			if(map.containsKey(c)) map.put(c, map.get(c)+1);
			else map.put(c, 1);
		}
		
		int max = Collections.max(map.values());
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==max) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}	
	}
	
	public static void dupElementsHighestInWord(String s) {
		String str[] = s.split(" ");
		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
		int max1 = 0;
		for(String val: str) {			
			LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();	
						
			char[] ch = val.toCharArray();
			for(char c: ch) {
				if(map.containsKey(c)) map.put(c, map.get(c)+1);
				else map.put(c, 1);
			}
			
			int max = Collections.max(map.values());
			
			for(Map.Entry<Character, Integer> entry: map.entrySet()) {
				if(entry.getValue()==max) {
					map1.put(val, entry.getValue());
					max1 = Collections.max(map1.values());
				}
			}			
		}
		for(Map.Entry<String, Integer> et: map1.entrySet()) {
			if(et.getValue()==max1) {
				System.out.println(et.getKey());
				break; //It will provide the first word
			}
		}
	}
	
}
