public class Main {
    public static void main(String[] args) {
        // Uncomment the following blocks to see the results of different arithmetic operations.
        
        /** 
         * Addition Example
         * int num1 = 7;
         * int num2 = 5;
         * int result = num1 + num2; // Adds num1 and num2
         * System.out.println(result); // Output: 12
         **/
        
        /** 
         * Subtraction Example
         * int num1 = 7;
         * int num2 = 5;
         * int result = num1 - num2; // Subtracts num2 from num1
         * System.out.println(result); // Output: 2
         **/
        
        /** 
         * Multiplication Example
         * int num1 = 7;
         * int num2 = 5;
         * int result = num1 * num2; // Multiplies num1 by num2
         * System.out.println(result); // Output: 35
         **/
        
        /** 
         * Division Example
         * int num1 = 7;
         * int num2 = 5;
         * int result = num1 / num2; // Divides num1 by num2
         * System.out.println(result); // Output: 1 (integer division)
         **/
        
        /** 
         * Modulus Example
         * int num1 = 7;
         * int num2 = 5;
         * int result = num1 % num2; // Returns the remainder of num1 divided by num2
         * System.out.println(result); // Output: 2
         **/
        
        // Initializing the variable 'num' with value 7
        int num = 7;
        
        // Demonstrating post-increment: prints the current value, then increments
        System.out.println(num++);    // Output: 7 (num becomes 8 after this line)

        // Demonstrating pre-increment: increments first, then prints the new value
        System.out.println(++num);     // Output: 9 (num was incremented to 9)

        // Demonstrating post-decrement: prints the current value, then decrements
        System.out.println(num--);     // Output: 9 (num becomes 8 after this line)

        // Demonstrating pre-decrement: decrements first, then prints the new value
        System.out.println(--num);     // Output: 7 (num was decremented to 7)

        // Using post-increment in an assignment
        int result = num++;            // result gets the current value of num (7), then num increments to 8
        System.out.println(result);     // Output: 7 (value of result)
        
        // Showing the current value of num after post-increment
        System.out.println(num);       // Output: 8 (num was incremented after assignment)
    }
}
