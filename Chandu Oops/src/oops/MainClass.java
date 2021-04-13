package oops;

//import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
		
		
		Person p1=new Person(24, "chandu");
//		EncapsulationIntro obj = new EncapsulationIntro();
//		p1.name="chandu";
//		p1.age=24;
		System.out.println(p1.name+ " " + p1.age);
		p1.walk();
		p1.eat();
		p1.walk(2);
//		obj.doWork();
		
		
		Developer d1 =new Developer(24, "chandu");
		d1.eat();
		d1.walk();
		d1.walk(4);
		
	

	}
}



  class Developer extends Person {

	public Developer(int age, String name) {
		super(age, name);
	}
		
		void walk() {
			   System.out.println("developer" +name + " " + "is walking");  
		      }

	}	   
	
 
  

 class Person  {
	protected String name;
	 int age;
	 static int Count; 
	 
	 
	 public Person (int age,String name) {
		 Count++;
		 this.name = name;
		 this.age = age;
		
		 
//		 public Person () {
//			 System.out.println("creating an object");
		 }
	 
 
 
   void walk() {
	   System.out.println(name + " " + "is walking");  
      }
   
   void eat() {
	   System.out.println(name + " " + " is eating ");
	   
     }
   
   void  walk(int steps) {
	   System.out.println(name +  " walked  " + steps + " steps ");
	   
   }
 }
   