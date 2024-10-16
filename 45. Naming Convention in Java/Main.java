// Naming Conventions Example in Java

// Class and Interface Naming
class Calculator {
    // Constants
    public static final double PI = 3.14; // Constant using upper case with underscores

    // Instance Variables
    private int number1; // Variable using camel case
    private int number2;

    // Constructor
    public Calculator(int number1, int number2) { // Constructor using Pascal case
        this.number1 = number1;
        this.number2 = number2;
    }

    // Method to perform addition
    public int add() { // Method using camel case
        return number1 + number2;
    }

    // Method to perform subtraction
    public int subtract() {
        return number1 - number2;
    }

    // Method to show numbers
    public void showNumbers() { // Method using camel case
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator calc = new Calculator(10, 5); // Using camel case for the variable

        // Showing numbers
        calc.showNumbers();

        // Performing operations
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());

        // Using constant
        System.out.println("Value of PI: " + Calculator.PI);
    }
}
