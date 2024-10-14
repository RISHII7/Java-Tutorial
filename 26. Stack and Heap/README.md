# Stack and Heap in Java

In Java, memory management is a critical concept and is divided into two key areas: **Stack** and **Heap** memory. Understanding how these two types of memory work is essential to write efficient Java programs.

---

## Stack Memory

The **stack** is a part of memory where method calls, local variables, and references to objects are stored. It follows a **Last In, First Out (LIFO)** principle, meaning the last function call added to the stack is the first one to be removed after execution.

### Key Characteristics:
- **Method Calls**: Every time a method is called, a new frame is added to the stack, which stores the method's local variables and parameters.
- **Primitive Data Types**: Variables of primitive types (like `int`, `float`, `char`, etc.) are stored directly in the stack.
- **Fast Access**: Stack memory is fast compared to heap memory due to its LIFO structure.
- **Limited Size**: Stack memory has a limited size. If a method recurses too deeply, it can lead to a `StackOverflowError`.
- **Thread-Specific**: Each thread in Java has its own stack, making it thread-safe.

### Stack Example:

```java
public class StackExample {
    public static void main(String[] args) {
        int x = 10;  // Stored in the stack
        int y = 20;  // Stored in the stack
        printSum(x, y);  // Method call adds a new frame to the stack
    }

    public static void printSum(int a, int b) {
        int sum = a + b;  // Local variables are stored in the stack
        System.out.println(sum);
    }
}
```

# Heap Memory in Java

In Java, **heap memory** is a crucial part of the memory structure used to store objects and instance variables created during program execution. Unlike the stack, which is primarily used for static memory allocation, the heap is used for **dynamic memory allocation** and is managed by the Java Garbage Collector.

---

## What is Heap Memory?

The heap is a large memory pool that is shared among all Java objects created during runtime. Every time you create an object using the `new` keyword, memory is allocated from the heap. Unlike stack memory, which is limited and follows a Last In, First Out (LIFO) approach, the heap allows objects to persist as long as they are needed.

### Key Characteristics of Heap Memory:
- **Dynamic Allocation**: Memory is allocated to objects during runtime.
- **Shared Among Threads**: Heap memory is shared by all threads running in the Java application.
- **Managed by Garbage Collector**: Java's Garbage Collector automatically reclaims memory when objects are no longer in use, preventing memory leaks.
- **Relatively Slower Access**: Accessing heap memory is slower compared to stack memory because of the need for dynamic memory management.
- **Large in Size**: The heap is much larger than the stack, which allows for storing more objects and data.
  
---

## Types of Heap Memory

Java divides the heap into several regions for better memory management:

1. **Young Generation**: 
   - This area holds short-lived objects. Objects created during the program’s execution are first stored here.
   - The Young Generation is further divided into two areas:
     - **Eden Space**: Where new objects are initially allocated.
     - **Survivor Spaces**: Where objects that survive garbage collection in the Eden space are moved.

2. **Old Generation (Tenured Generation)**:
   - Objects that live long enough are eventually moved to the Old Generation. These are generally objects that are still in use after several garbage collection cycles.

3. **Permanent Generation (MetaSpace)**:
   - This area contains metadata required by the JVM. It includes information about classes, methods, and constants.

---

## How Heap Memory Works

### Object Creation:

Whenever you create an object in Java using the `new` keyword, memory is allocated from the heap. This memory includes space for the object's data and its reference. The reference itself is stored in the stack, but the actual object resides in the heap.

```java
class Person {
    String name;  // Instance variable stored in the heap

    public Person(String name) {
        this.name = name;  // Allocated in heap
    }
}

public class HeapExample {
    public static void main(String[] args) {
        // Memory for 'p1' is allocated in the heap
        Person p1 = new Person("John");
        
        // Memory for 'p2' is allocated in the heap
        Person p2 = new Person("Jane");
    }
}
```