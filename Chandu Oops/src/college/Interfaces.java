package college;


		
	   interface Firstinterface {
		    public void animalSound();    
	}
	   
	   class Dog implements Firstinterface {
		public void animalSound() {
			System.out.println("Dog Sound  Bho bho....");
			
			
		}
		   
		   
	   }

	   public class Interfaces {

			public static void main(String[] args) {
				
				Dog d1 = new Dog ();
				d1.animalSound();
				
				
			}
	   }
