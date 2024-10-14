// Define the Calculator class
class Calculator {
    // Method to add three integers
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3; // Return the sum of the three integers
    }

    // Method to add two integers
    public int add(int n1, int n2) {
        return n1 + n2; // Return the sum of the two integers
    }

    // Method to add a double and an integer
    public double add(double n1, int n2) {
        return n1 + n2; // Return the sum of the double and the integer
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator obj = new Calculator();

        // Call the add method with two integers and store the result
        int r1 = obj.add(3, 4); // This will call the second add method
        System.out.println(r1); // Print the result of the addition
    }
}
