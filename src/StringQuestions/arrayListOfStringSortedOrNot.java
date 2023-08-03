package StringQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayListOfStringSortedOrNot {
	
	public static void main(String[] args) {
		List<String> array = new ArrayList<>(Arrays.asList("a","b","c","d"));
		List<Integer> array1 = new ArrayList<>(Arrays.asList(10,3,5,7));
		System.out.println(sort(array));
		System.out.println(sort(array1));
	}
	
	
	public static <T extends Comparable<? super T>> boolean sort(List<T> myList) {
		List<T> tmp = new ArrayList<>(myList);
		Collections.sort(tmp);
		boolean sorted = tmp.equals(myList);
		return sorted;
	}

}
