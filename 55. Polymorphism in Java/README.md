# Polymorphism in Java

Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows methods to do different things based on the object that it is acting upon. In Java, polymorphism is mainly divided into two types: **compile-time polymorphism** (also known as method overloading) and **runtime polymorphism** (also known as method overriding).

## Table of Contents
1. [What is Polymorphism?](#what-is-polymorphism)
2. [Types of Polymorphism](#types-of-polymorphism)
   - [Compile-Time Polymorphism](#compile-time-polymorphism)
   - [Runtime Polymorphism](#runtime-polymorphism)
3. [Advantages of Polymorphism](#advantages-of-polymorphism)
4. [Examples](#examples)
   - [Example of Compile-Time Polymorphism](#example-of-compile-time-polymorphism)
   - [Example of Runtime Polymorphism](#example-of-runtime-polymorphism)
5. [Conclusion](#conclusion)

## What is Polymorphism?

The term **polymorphism** means "many forms." In Java, it allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. This ability to call the same method on different objects and have it behave differently is what makes polymorphism so powerful and essential in OOP.

## Types of Polymorphism

### Compile-Time Polymorphism

Compile-time polymorphism is achieved through **method overloading**. In this type, multiple methods have the same name but differ in the type or number of parameters. The method that gets called is determined at compile time based on the method signature.

#### Characteristics:
- Resolved during compile time.
- Achieved by method overloading and operator overloading (not applicable in Java as it does not support operator overloading).

### Runtime Polymorphism

Runtime polymorphism is achieved through **method overriding**. In this type, a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be invoked is determined at runtime based on the object being referenced.

#### Characteristics:
- Resolved during runtime.
- Achieved by method overriding.

## Advantages of Polymorphism

1. **Code Reusability**: Polymorphism allows methods to be reused, which leads to less code redundancy.
2. **Flexibility and Maintainability**: It enables you to write flexible and maintainable code. You can use a unified interface for different data types.
3. **Dynamic Method Resolution**: With runtime polymorphism, Java can resolve method calls at runtime, enabling more dynamic and flexible code.

## Examples

### Example of Compile-Time Polymorphism

```java
public class MathOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        System.out.println("Sum of 2 and 3: " + math.add(2, 3));            // Calls first method
        System.out.println("Sum of 2, 3 and 4: " + math.add(2, 3, 4));    // Calls second method
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));  // Calls third method
    }
}
``` 
### Output 
```java
Sum of 2 and 3: 5
Sum of 2, 3 and 4: 9
Sum of 2.5 and 3.5: 6.0
```

### Example of Run-Time Polymorphism

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Upcasting
        Animal myCat = new Cat();  // Upcasting

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
```
### Output
```java
Dog barks
Cat meows
```

## Conclusion
Polymorphism is a powerful feature in Java that enhances the flexibility and maintainability of code. By utilizing compile-time and runtime polymorphism, developers can write more generic and reusable code, leading to better software design.