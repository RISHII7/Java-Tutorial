# Multiple Inheritance in Java

## What is Inheritance?
Inheritance is one of the core concepts of Object-Oriented Programming (OOP). It allows one class to acquire the properties (fields) and behaviors (methods) of another class. The class that is inherited is called the **parent class** (or superclass), and the class that inherits is called the **child class** (or subclass).

## What is Multiple Inheritance?
**Multiple Inheritance** is a feature where a class can inherit from more than one class. This means that a single child class would have multiple parent classes. It allows the child class to access the features of all the parent classes.

## Why Java Doesn't Support Multiple Inheritance?
Java does not support multiple inheritance for classes to avoid the complexity and ambiguity caused by the diamond problem. The designers of Java decided that simplicity and readability were more important than the additional flexibility provided by multiple inheritance.

In Java, a class can only inherit from one class using the extends keyword. If multiple inheritance were allowed, Java would face ambiguity when multiple parent classes have methods with the same name.

## Example: Ambiguity in Multiple Inheritance
```java
class A {
    public void show() {
        System.out.println("Class A Method");
    }
}

class B {
    public void show() {
        System.out.println("Class B Method");
    }
}

// Java does not allow this kind of declaration
// class C extends A, B { 
// }

public class Demo {
    public static void main(String[] args) {
        // C obj = new C(); // Error: Multiple inheritance not supported
        // obj.show();      // Ambiguity: Which show method should be called?
    }
}
```
**Output:**

Java will not compile the code as it does not allow a class to extend more than one class.

## Solution in Java: Using Interfaces
Although Java does not support multiple inheritance through classes, it does support multiple inheritance through interfaces. An interface is a reference type in Java that can contain method signatures and static methods (but no implementations). A class can implement multiple interfaces, thereby providing a way to achieve multiple inheritance.

## Example of Multiple Inheritance Using Interfaces
```java
interface A {
    void display();
}

interface B {
    void display();
}

class C implements A, B {
    // Must implement the display method for both interfaces
    public void display() {
        System.out.println("Display from C");
    }
}

public class Demo {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();  // No ambiguity since C provides the implementation
    }
}
```
- **Output:**  
Display from C

In this case, `C` can implement both interfaces `A` and `B` without any ambiguity because it provides its own implementation of the `display()` method.

## Conclusion
- **Java does not support multiple inheritance** using classes due to potential ambiguity and the complexity caused by the diamond problem.
- Instead, Java allows **multiple inheritance through interfaces**, which achieves the same goal but avoids ambiguity by requiring the class to implement the methods of all interfaces explicitly.

By preventing multiple inheritance through classes and allowing it through interfaces, Java achieves a balance between flexibility and simplicity.
##
