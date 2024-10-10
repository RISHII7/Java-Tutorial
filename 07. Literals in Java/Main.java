public class Main {
    public static void main(String[] args) {
        // Binary literal
        int num1 = 0b101;  // Binary representation of 5
        System.out.println(num1);

        // Hexadecimal literal
        int num2 = 0x7E;   // Hexadecimal representation of 126
        System.out.println(num2);

        // Integer with underscores for readability (1 crore)
        int num3 = 10_00_00_000; 
        System.out.println(num3);

        // Implicit conversion from int to float
        float num4 = 56;
        System.out.println(num4);

        // Implicit conversion from int to double
        double num5 = 56;
        System.out.println(num5);

        // Scientific notation
        double num6 = 12e10;  // 12 * 10^10
        System.out.println(num6);

        // Corrected boolean assignment
        boolean num7 = true; // Boolean values can be either true or false
        System.out.println(num7);

        // Character increment
        char c = 'a';
        System.out.println(c);
        c++;  // Increment the character
        System.out.println(c); // Should print 'b'

        // Another character increment example
        char c1 = 'a';
        c1++;
        System.out.println(c1); // Should print 'b'
    }
}
