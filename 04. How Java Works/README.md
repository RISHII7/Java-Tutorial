# How Java Works

Java is a high-level, object-oriented programming language that follows the principle of "Write Once, Run Anywhere" (WORA). This guide provides an overview of how Java works, including its architecture and the execution process.

## 1. Java Architecture

Java's architecture is based on the concept of the Java Virtual Machine (JVM) and the Java Runtime Environment (JRE). The primary components of Java architecture are:

- **Java Development Kit (JDK)**: A software development kit that includes the JRE, compiler (`javac`), and other tools for developing Java applications.
- **Java Runtime Environment (JRE)**: A runtime environment that includes the JVM and libraries required to run Java applications.
- **Java Virtual Machine (JVM)**: An abstract computing machine that enables Java bytecode to be executed on any platform without modification.

### 1.1 Java Compilation Process

1. **Source Code**: Java programs are written in plain text files with the `.java` extension.
2. **Compilation**: The Java compiler (`javac`) compiles the source code into an intermediate form called bytecode, which is stored in `.class` files. This bytecode is platform-independent.
3. **Execution**: The JVM interprets the bytecode and translates it into machine code specific to the underlying operating system and hardware.

## 2. How Java Executes Programs

### 2.1 Steps of Execution

1. **Write the Code**: Developers write Java code in text files using an Integrated Development Environment (IDE) or a text editor.
2. **Compile the Code**: The `javac` compiler compiles the `.java` files into bytecode (`.class` files). For example:
   ```bash
   javac Hello.java
