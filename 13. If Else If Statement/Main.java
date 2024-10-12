public class Main {
    public static void main(String[] args) {
        // Initialize variables x, y, and z
        int x = 8;
        int y = 7;
        int z = 8;

        // Check if x is the greatest among x, y, and z
        if (x > y && x > z) { // This condition is false (8 is not greater than 8)
            System.out.println(x);
        } else {
            System.out.println(y); // Since the condition is false, print y (7)
        }

        // Re-initialize variables for the second example
        x = 8;
        y = 7;
        z = 9;

        // Determine the greatest number among x, y, and z
        if (x > y && x > z) { // This condition is false (8 is not greater than 9)
            System.out.println(x);
        } else if (y > x && y > z) { // This condition is also false (7 is not greater than 9)
            System.out.println(y);
        } else {
            System.out.println(z); // Since both conditions are false, print z (9)
        }

        // Re-initialize variables for the third example
        x = 8;
        y = 7;
        z = 9;

        // Another check to determine the greatest number
        if (x > y && x > z) { // This condition is false (8 is not greater than 9)
            System.out.println(x);
        } else if (y > z) { // This condition is false (7 is not greater than 9)
            System.out.println(y);
        } else {
            System.out.println(z); // Print z (9) as the greatest number
        }
    }
}
