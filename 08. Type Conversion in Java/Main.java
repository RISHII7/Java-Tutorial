public class Main {
    public static void main(String[] args) {
        // Implicit type conversion (Widening)
        byte b = 127;
        int a = b; // byte to int conversion (widening)
        System.out.println(b);
        System.out.println(a);
        
        byte b1 = 125;
        int a0 = b1; // byte to int conversion (widening)
        System.out.println(b1);
        System.out.println(a0);
        
        // Explicit type conversion (Narrowing)
        int aa = 257;
        byte k = (byte) aa; // int to byte conversion (narrowing), causes overflow
        System.out.println(k); // Prints the wrapped around value due to overflow
        
        // Floating-point to integer conversion
        float f = 5.6f;
        int t = (int) f; // float to int conversion (narrowing), fractional part lost
        System.out.println(t); // Prints 5
        
        // Another narrowing example with byte
        int a2 = 2567;
        byte b2 = (byte) a2; // int to byte conversion, causes overflow
        System.out.println(b2); // Prints the wrapped around value due to overflow
        
        // Multiplication of two byte values
        byte a3 = 10;
        byte b4 = 20;
        int result = a3 * b4; // Byte multiplication results in an int
        System.out.println(result); // Prints 200
    }
}
