package college;

class Vehicle {
  String brand = "Ford";        
  public void honk() {                    
    System.out.println("Tuut, tuut!");
  }
}

    class Car extends Vehicle {
    String modelName = "Mustang";   
    public static void main(String[] args) {

    Car myCar = new Car();

    myCar.honk();
    
  }
}
