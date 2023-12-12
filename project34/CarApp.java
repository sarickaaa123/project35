package project34;

public class CarApp {

	public static void main(String[]args) {}
    Car defaultCar = new Car();
    {
	Car customCar = new Car("Toyota", "Camry", 2022);
	System.out.println("Default Car Details: " + defaultCar);
    System.out.println("Custom Car Details: " + customCar);
}
  }
