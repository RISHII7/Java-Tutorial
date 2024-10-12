public class Main {
    public static void main(String[] args) {
        // First declaration of x
        int x = 8; 
        System.out.println("Hello");
        System.out.println("Bye");

        // Using a different scope to avoid redeclaration
        x = 18; // Updating the value of x
        if (x > 10) {
            System.out.println("Hello"); // This will print because x is 18
        }

        // This block will always execute because the condition is true
        if (true) {
            System.out.println("Hello");
        }

        // New declaration of x with a different scope
        x = 28; // Updating the value of x
        if (x > 10 && x <= 20) { // This condition is false
            System.out.println("Hello"); // This will not execute
        }
        System.out.println("Bye");

        // Checking again with a different scope
        x = 28; // Updating the value of x
        if (x > 10 && x <= 20) { // This condition is still false
            System.out.println("Hello"); // This will not execute
        } else {
            System.out.println("Bye"); // This will execute because the if condition is false
        }

        // Declaring a second variable y
        int y = 7; 
        if (x > y) { // Since x is 28, this condition is true
            System.out.println(x); // This will print 28
            System.out.println("Thank you"); // This will also print
        } else {
            System.out.println(y); // This will not execute
        }
    }
}
