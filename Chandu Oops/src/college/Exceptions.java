package college;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
		
		int myNumber[] = {1,2,3};
		
		System.out.println(myNumber[10]);
		
		}
		
		  catch(ArrayIndexOutOfBoundsException e)
		
		{	
			System.out.println("something went wrong");
		}
		
	}
			
		}