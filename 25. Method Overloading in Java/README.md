# Method Overloading in Java

Method overloading is a feature in Java that allows a class to have more than one method with the same name, but with different parameter lists. This enhances the readability of the program and allows the same method to perform different tasks based on the input provided.

## Key Points of Method Overloading

- **Same Method Name**: All overloaded methods must have the same name.
- **Different Parameter Lists**: Overloaded methods must differ in the number or type of parameters. The return type can be the same or different but does not affect the method overloading.
- **Compile-Time Polymorphism**: Method overloading is an example of compile-time polymorphism, where the method to be executed is determined at compile time based on the method signature.

## Benefits of Method Overloading

- **Increased Readability**: By using the same method name for similar actions, the code becomes more intuitive and easier to read.
- **Code Reusability**: Overloaded methods can perform similar operations with different input parameters, reducing redundancy in the code.

## Example of Method Overloading

Below is an example of a `Calculator` class demonstrating method overloading:

```java
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

        // Call the add method with two integers
        int sum1 = obj.add(3, 4); // Calls the method with two integer parameters
        System.out.println("Sum of 3 and 4: " + sum1);

        // Call the add method with three integers
        int sum2 = obj.add(1, 2, 3); // Calls the method with three integer parameters
        System.out.println("Sum of 1, 2 and 3: " + sum2);

        // Call the add method with a double and an integer
        double sum3 = obj.add(5.5, 4); // Calls the method with a double and an integer
        System.out.println("Sum of 5.5 and 4: " + sum3);
    }
}
```

## Output

- Sum of 3 and 4: 7
- Sum of 1, 2 and 3: 6
- Sum of 5.5 and 4: 9.5