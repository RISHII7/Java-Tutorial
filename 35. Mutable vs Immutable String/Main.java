public class Main {
    public static void main(String[] args) {

        // Example of Immutable String (String Class)
        String str1 = "Hello";
        System.out.println("Original String: " + str1);

        // Trying to modify str1 by concatenating another string
        str1.concat(" World");
        System.out.println("After concat() call: " + str1); // str1 remains unchanged

        // The correct way to modify an immutable string is to assign it to a new string
        str1 = str1.concat(" World");
        System.out.println("Modified String after assignment: " + str1);

        // Example of Mutable String (StringBuilder Class)
        StringBuilder str2 = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + str2);

        // Modifying the content of StringBuilder
        str2.append(" World");
        System.out.println("After append() call: " + str2); // str2 is modified directly
    }
}
