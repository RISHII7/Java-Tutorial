// Class Calc - base class for basic calculator functions
class Calc {
    // Method to add two numbers
    public int add(int n1, int n2) {
        return n1 + n2; // Adds two numbers and returns the result
    }
}

// Class AdvCalc extends Calc - a more advanced calculator
class AdvCalc extends Calc {
    // Overriding the add method to modify its behavior
    @Override
    public int add(int n1, int n2) {
        return n1 + n2 + 1; // Adds an extra 1 to the sum of the two numbers
    }
}

// Main class to run the program
public class Main {
    public static void main(String args[]) {
        // Creating an object of AdvCalc class, which inherits from Calc
        AdvCalc obj = new AdvCalc();

        // Calling the overridden add method in AdvCalc
        int r1 = obj.add(3, 4); // This will return 3 + 4 + 1 = 8

        // Output the result
        System.out.println(r1); // Prints: 8
    }
}
