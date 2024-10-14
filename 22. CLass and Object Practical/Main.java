class Calculator {
    // Method to add two integers
    public int add(int n1, int n2) {
        // Calculate the sum of the two numbers
        int r = n1 + n2;
        System.out.println("In add method");
        return r; // Return the result
    }
}

public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // Create a Calculator object
        Calculator calc = new Calculator();
        
        // Call the add method and store the result
        int result = calc.add(num1, num2);
        System.out.println("The result of addition is: " + result);
    }
}
