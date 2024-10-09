// In Java, every program starts with a class. 
// A class is like a blueprint or a template that defines the properties and behavior of an object.
public class Hello {
    // The "main" method is the entry point of the program, where the program starts executing.
    // The "public" access modifier means it can be accessed from anywhere, 
    // and "static" means it can be called without creating an instance of the class.
    public static void main(String[] args) {
        // When the program is run, the Java Virtual Machine (JVM) is started.
        // The JVM is a program that runs Java bytecode on a computer.
        // The JVM reads the "main" method and starts executing the code inside it.
        
        // The "System.out" object is a built-in object in Java that allows us to print output to the console.
        // The "println" method is a part of the "System.out" object that prints its argument to the console, 
        // followed by a newline character.
        System.out.println("Hello, World!");
        
        // When the "println" method is called, the JVM executes the code inside the method.
        // The code inside the "println" method writes the string "Hello, World!" to the console, 
        // followed by a newline character.
        
        // After the "println" method is executed, the JVM continues to the next line of code.
        // Since there is no more code in the "main" method, the program terminates.
    }
}