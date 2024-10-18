# Method Overriding in Java

## Overview

**Method overriding** in Java is a feature that allows a subclass (child class) to provide a specific implementation for a method that is already defined in its superclass (parent class). When a method in a subclass has the same name, return type, and parameters as a method in the parent class, the subclass's method overrides the parent class's method.

This feature is a key aspect of **polymorphism** in object-oriented programming, enabling dynamic method dispatch at runtime.

---

## Key Points of Method Overriding
- The method in the child class must have the same name, return type, and parameter list as the method in the parent class.
- Method overriding occurs only in an inheritance relationship.
- The overridden method in the parent class must be accessible (i.e., not marked as `private` or `final`).
- The overriding method in the subclass can provide its own specific implementation.
- The method call is determined at **runtime** (dynamic method dispatch), not compile-time.

---

## Rules for Method Overriding
1. **Same Method Signature**: The method in the subclass must have the same name, return type, and parameters as in the parent class.
2. **Access Modifier**: The access level of the overriding method must not be more restrictive than that of the method in the parent class.
   - For example, if the parent class method is `public`, the overriding method cannot be `protected` or `private`.
3. **Cannot Override Static or Final Methods**: Static methods belong to the class and are not associated with any specific instance, so they cannot be overridden. Similarly, `final` methods cannot be overridden.
4. **Optional use of the `super` keyword**: If you want to invoke the parent class’s method within the subclass's overriding method, you can use the `super` keyword.

---

## Example of Method Overriding in Java

```java
// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class that overrides the parent class method
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog dog = new Dog();
        
        // Calls the overridden method in Dog class
        dog.sound();  // Output: Dog barks
    }
}
```

### Explanation:
1. **Parent Class (`Animal`):**
    - Has a method `sound()` which prints "Animal makes a sound".
2. **Child Class (`Dog`):**
    - Overrides the `sound()` method to provide its own implementation, printing "Dog barks".
3. **Main Class:**
    - When the `sound()` method is called on a `Dog` object, the overridden version in the `Dog` class is executed, showing "Dog barks".

## 

### Dynamic Method Dispatch
Method overriding is used to achieve dynamic method dispatch. This means that the decision of which method (parent class or child class) to call is made at runtime, based on the actual object.

**Example:**
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal a;

        a = new Dog(); // Dog object is assigned
        a.sound();     // Output: Dog barks

        a = new Cat(); // Cat object is assigned
        a.sound();     // Output: Cat meows
    }
}
```
### Explanation:
- Here, the variable `a` is of type `Animal`, but it refers to different objects at runtime (`Dog` and `Cat`).
- The method `sound()` is called based on the actual object type, not the reference type (`Animal`).

## 
 
### Why Use Method Overriding?
1. **Polymorphism:** It allows a class to define a general behavior (in the parent class) and child classes can customize the behavior as needed.

2. **Code Reusability:** The base class methods can be reused, and only the necessary part of the method behavior needs to be changed in the subclass.

3. **Flexible Design:** Method overriding provides flexibility to use a common interface for different objects. A superclass reference can refer to a subclass object and execute the subclass’s overridden method.

##

### Conclusion
Method overriding is a key feature in Java's inheritance mechanism. It allows subclasses to modify the behavior of methods inherited from their parent class, enabling polymorphism and flexible program design. With method overriding, Java provides the ability to handle object-oriented programming more efficiently and dynamically.