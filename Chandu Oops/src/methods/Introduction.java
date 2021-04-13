package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber=31;
		int secondNumber=3;
		
		int a=2;
		int b=3;
		sayHi();
	
		sayHi();
		
		int addition =add(a,b);
		System.out.println(addition);
		
		int result=maxOf(firstNumber,secondNumber);
		 
         System.out.println(result);
	}

	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
			
		}
	}
	
		
		static void sayHi() {
			System.out.println("Hi " + "Good Morning");
			
		}
		
		static int add(int a, int b) {
			
			
			return a+b;
			
		}
		
		
	}

