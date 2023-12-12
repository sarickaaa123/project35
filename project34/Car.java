package project34;

public class Car {
	private String make;
    private String model;
    private int year;
    
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +'}';
    }
}
	        

	