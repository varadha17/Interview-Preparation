package StringQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class usingIterator {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("how");
		set.add("hi");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		 
		
	}

}
