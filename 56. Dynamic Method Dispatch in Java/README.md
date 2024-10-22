# Dynamic Method Dispatch in Java

Dynamic Method Dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile time. This is an essential feature of Java's polymorphism and is commonly used in scenarios where a parent class reference can point to a child class object. This allows the program to decide which method implementation to execute based on the actual object type being referenced.

## Key Concepts

1. **Method Overriding**: 
   - Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The overridden method in the subclass should have the same name, return type, and parameters as the method in the superclass.

2. **Parent Class Reference**: 
   - A reference variable of a parent class can point to an object of a child class. This allows for dynamic method dispatch.

3. **Runtime Resolution**: 
   - The method that gets executed is determined at runtime based on the type of the object being referenced, not the type of the reference variable.

## How Dynamic Method Dispatch Works

- When a subclass object is assigned to a parent class reference, Java uses dynamic method dispatch to determine which overridden method to call at runtime.
- This allows for greater flexibility and the ability to extend functionalities without modifying existing code.

## Example of Dynamic Method Dispatch

Here’s an example demonstrating dynamic method dispatch:

```java
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Parent class reference pointing to a Dog object
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog barks

        // Parent class reference pointing to a Cat object
        myAnimal = new Cat();
        myAnimal.sound(); // Output: Cat meows

        // Parent class reference pointing to an Animal object
        myAnimal = new Animal();
        myAnimal.sound(); // Output: Animal makes a sound
    }
}
```

## Explanation of the Example

1. **Class Definitions:**
- `Animal`: A base class with a method `sound()`.
- `Dog` and `Cat`: Subclasses of `Animal` that override the `sound()` method.

##
2. **Dynamic Method Dispatch:**
- In the `main` method, an `Animal` reference (`myAnimal`) is assigned to a `Dog` object. When `myAnimal.sound()` is called, the `sound()` method of the `Dog` class is executed, demonstrating dynamic method dispatch.
- The reference is then changed to a `Cat` object, and the `sound()` method of the `Cat` class is executed.
- Finally, when it points to an `Animal` object, the method from the `Animal` class is called.

### Benefits of Dynamic Method Dispatch
- **Flexibility:** It allows programmers to write more generic and reusable code.
- **Maintainability:** Changes can be made to subclasses without altering the parent class or client code.
- **Extensibility:** New subclasses can be added with their own implementations without changing the existing system.


## Conclusion
Dynamic Method Dispatch is a fundamental concept in Java that enables polymorphism, allowing methods to be called based on the object type at runtime rather than compile time. This leads to more flexible and maintainable code, making it a crucial aspect of object-oriented programming in Java.