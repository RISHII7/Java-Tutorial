# First Code in Java

Welcome to the **First Code in Java** repository! This repository contains the most basic Java program to help beginners understand the fundamental structure of a Java application: a simple "Hello, World!" program.

## Purpose

The purpose of this repository is to provide a starting point for learning Java. The program demonstrates:

- The structure of a Java class.
- The main method, which is the entry point for Java applications.
- How to print text to the console using `System.out.println()`.

## Code Overview

Below is the source code for the `Hello` class that prints "Hello, World!" to the console:

```java
// This is a Java class, which is a blueprint for creating objects. 
// The class is named "Hello".
public class Hello {

    // This is the main method, which is the entry point for any Java program.
    // The "public" access modifier means it can be accessed from anywhere, 
    // and "static" means it can be called without creating an instance of the class.
    public static void main(String[] args) {
        
        // This line prints "Hello, World!" to the console.
        // "System.out" is a built-in object in Java that allows us to print output to the console.
        // "println" is a method that prints its argument to the console, followed by a newline character.
        System.out.println("Hello, World!");
    }
}
```

## Requirements

Before running the program, make sure you have the following:

- **Java Development Kit (JDK)** installed on your system.
- A **text editor** or an Integrated Development Environment (IDE) like **IntelliJ IDEA** or **VS Code**.

If you haven't installed the JDK yet, follow the [Java Development Kit Setup Guide](#) to get started.

## Steps to Compile and Run

### 1. Compile the Program

To compile the `Hello.java` file, open a terminal or command prompt and navigate to the directory where the file is saved. Use the `javac` command to compile the program:

```bash
javac Hello.java
```

This will generate a `Hello.class` file, which is the bytecode for your program.

### 2. Run the Program

After compiling the code, use the `java` command to run the program:

```bash
java Hello
```

You should see the following output:

```
Hello, World!
```

## Additional Notes

- The `Hello.java` file must be saved with the same name as the class, i.e., `Hello`.
- Ensure that your JDK is correctly set up, and the `java` and `javac` commands are available in your terminal's path.

## Resources

- [Oracle's Official Java Documentation](https://docs.oracle.com/en/java/)
- [Download the Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

## Contributing

If you find any issues or have suggestions for improving this code or documentation, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
