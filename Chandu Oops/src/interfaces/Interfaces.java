package interfaces;

public class Interfaces implements car,person {

	public static void main(String[] args) {
		
	   }

	@Override
	public void start() {
		 System.out.println("my car is starting");
		
	}

	@Override
	public void walk() {
		System.out.println("my car is walking");
		
	}
 }

   interface car {
	  void start();
   }
   
   interface person {
   void walk();
   
   }

	
	
