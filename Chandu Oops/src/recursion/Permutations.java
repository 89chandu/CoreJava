       package recursion;

      public class Permutations {
    		  
      
       
      
	
		static void permutations(String s, int l, int r) {
			
			 permutations("abc", 0, 2);
			if(l == r) {
//				if(set.contains(s)) return;
//				set.add(s);
				System.out.println(s);
				return;
			}
			
			for(int i = l; i<=r; i++) {
				s = interchangeChar(s, l, i);
				permutations(s, l+1, r);
				s = interchangeChar(s, l, i);
			}
		}
		
		static String interchangeChar(String s, int a, int b) {
			char array[] = s.toCharArray();
			char temp = array[a];
			array[a] = array[b];
			array[b] = temp;
			return String.valueOf(array);
		}
	
		
	}
      

