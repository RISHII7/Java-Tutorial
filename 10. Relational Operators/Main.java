public class Main {
    public static void main(String[] args) {
        int x = 6;  // Initializing variable x with value 6
        int y = 5;  // Initializing variable y with value 5
        
        // Using relational operators to compare x and y
        // Uncomment any of the lines below to test different relational operations
        
        // boolean result = x < y;    // Less than
        // boolean result = x > y;    // Greater than
        // boolean result = x >= y;   // Greater than or equal to
        // boolean result = x <= y;   // Less than or equal to
        // boolean result = x != y;   // Not equal to
        boolean result = x == y;      // Equal to
        
        // Output the result of the comparison
        System.out.println("Is x equal to y? " + result); // Output: false

        double a = 8.8;  // Initializing variable a with value 8.8
        double b = 9.8;  // Initializing variable b with value 9.8
        
        // Using relational operators to compare a and b
        // Uncomment the line below to test the less than or equal to operation
        // boolean res = a <= b;    // Less than or equal to
        boolean res = a >= b;       // Greater than or equal to
        
        // Output the result of the comparison
        System.out.println("Is a greater than or equal to b? " + res); // Output: false
    }
}
