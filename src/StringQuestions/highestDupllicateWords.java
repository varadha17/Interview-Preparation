package StringQuestions;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class highestDupllicateWords {
	
	public static void main(String[] args) {
		duplicateWords("hello everyone how are you");
	}
	
	static void duplicates(String s) {
		char ch[] = s.toCharArray();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(char ch1:ch) {
			if(map.containsKey(ch1)) map.put(ch1, map.get(ch1)+1);
			else map.put(ch1, 1);
		}
		
		int max = Collections.max(map.values());
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==max) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
	
	static void duplicateWords(String s) {
		String split[] = s.split(" ");
		LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
		int max1 = 0;
		for(String str: split) {
			char ch[] = str.toCharArray();
			
			LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
			
			for(char ch1: ch) {
				if(map.containsKey(ch1)) map.put(ch1, map.get(ch1)+1);
				else map.put(ch1, 1);
			}
			int max = Collections.max(map.values());
			for(Map.Entry<Character, Integer> entry: map.entrySet()) {
				if(entry.getValue()==max) {
					map1.put(str, entry.getValue());
					max1 = Collections.max(map1.values());
				}
			}
		}
		
		for(Map.Entry<String, Integer> entry: map1.entrySet()) {
			if(entry.getValue()==max1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}

}
