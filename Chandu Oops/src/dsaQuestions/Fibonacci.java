package dsaQuestions;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      int a = 0;
      int b = 1;
      
      System.out.print(a + " ");
      System.out.print(b + " ");
      
      
      
      for (int i=0;i<b;i++) {
    	  
    	  int c=a+b;
      
      System.out.println(c + " ");
      a=b;
      b=c;
      
      	   }
	}
}
