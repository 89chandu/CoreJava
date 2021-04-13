package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		Map<String,Integer> numbers = new HashMap<>(); 
		
		numbers.put("chandu", 21);
		numbers.put("avi", 27);
		numbers.put("niles", 21);
		
		numbers.put("chandu", 22);
		
		System.out.println(numbers);
		
		
	}

}
