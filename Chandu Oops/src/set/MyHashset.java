package set;

import java.util.*;

public class MyHashset {

	public static void main(String[] args) {
		
		Set<Integer> x= new HashSet<Integer>();
		
		x.add(2);
		x.add(3);
		x.add(4);
		
		
		Set<Integer> y= new HashSet<Integer>();
		y.add(5);
		y.add(6);
		y.add(2);
		
		x.addAll(y);
		
		System.out.println(x);
		
	
	}

}
