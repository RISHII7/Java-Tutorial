# Introduction to Java

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It was originally developed by **James Gosling** at **Sun Microsystems** in 1995. Java is a widely-used language known for its portability, scalability, and performance. With its "Write Once, Run Anywhere" (WORA) capability, Java programs can run on any device that supports the Java Virtual Machine (JVM), making it ideal for cross-platform development.

## Key Features of Java

- **Object-Oriented**: Everything in Java revolves around objects. This makes the language modular, flexible, and easier to maintain.
- **Platform-Independent**: Java code is compiled into bytecode, which can be executed on any platform that has the JVM installed.
- **Robust**: Java offers strong memory management and automatic garbage collection, reducing the chances of memory leaks and crashes.
- **Secure**: Java provides a secure platform through its bytecode verification, sandboxing of untrusted code, and built-in security features.
- **Multithreaded**: Java makes it easier to write programs that can perform multiple tasks simultaneously by using threads.
- **High Performance**: The Just-In-Time (JIT) compiler in the JVM improves the performance of Java applications by optimizing bytecode into native machine code at runtime.

## Common Java Use Cases

1. **Web Development**: With frameworks like Spring and JavaServer Faces (JSF), Java is widely used for building dynamic web applications.
2. **Mobile Development**: Android, the most popular mobile operating system, relies heavily on Java for app development.
3. **Enterprise Applications**: Java's scalability and security make it the go-to choice for large-scale enterprise solutions.
4. **Desktop GUI Applications**: Java supports the development of cross-platform desktop applications using libraries like Swing and JavaFX.
5. **Scientific Applications**: Java's reliability and portability make it ideal for computational and scientific applications.

## Example: Hello World in Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
