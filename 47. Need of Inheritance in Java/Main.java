// Superclass
class Vehicle {
    int speed;
    int fuel;

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass 1
class Car extends Vehicle {
    int numberOfDoors;

    public void showCarDetails() {
        System.out.println("Car Details: ");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// Subclass 2
class Bike extends Vehicle {
    boolean hasCarrier;

    public void showBikeDetails() {
        System.out.println("Bike Details: ");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Has carrier: " + hasCarrier);
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car = new Car();
        car.speed = 120;
        car.fuel = 50;
        car.numberOfDoors = 4;
        car.start(); // Inherited method from Vehicle class
        car.showCarDetails(); // Car-specific method
        car.stop();

        System.out.println();

        // Creating an object of the Bike class
        Bike bike = new Bike();
        bike.speed = 80;
        bike.fuel = 10;
        bike.hasCarrier = true;
        bike.start(); // Inherited method from Vehicle class
        bike.showBikeDetails(); // Bike-specific method
    }
}
