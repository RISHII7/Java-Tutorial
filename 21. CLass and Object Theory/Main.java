// Define a class named 'Car'
class Car {
    // Attributes (or fields) of the class
    String color;
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    // Method to start the car
    void start() {
        System.out.println(model + " is starting...");
    }

    // Method to stop the car
    void stop() {
        System.out.println(model + " is stopping...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Red", "Toyota Camry", 2021);

        // Call methods on the Car object
        myCar.displayDetails();
        myCar.start();
        myCar.stop();
    }
}
