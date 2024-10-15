public class Main {
    public static void main(String[] args) {
        // Creating a string in Java
        String greeting = "Hello, World!";

        // Printing the string
        System.out.println(greeting);

        // Finding the length of the string
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);

        // Accessing a character at a specific index
        char firstChar = greeting.charAt(0);
        System.out.println("The first character is: " + firstChar);

        // Substring example
        String subStr = greeting.substring(7);
        System.out.println("Substring starting from index 7: " + subStr);

        // Concatenating strings
        String name = "Java";
        String fullGreeting = greeting + " Welcome to " + name + "!";
        System.out.println(fullGreeting);

        // String comparison
        String anotherGreeting = "Hello, World!";
        boolean isEqual = greeting.equals(anotherGreeting);
        System.out.println("Are the strings equal? " + isEqual);
    }
}
