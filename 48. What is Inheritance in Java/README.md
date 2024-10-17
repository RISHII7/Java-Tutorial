# Inheritance in Java

## Introduction
Inheritance is one of the fundamental concepts in Object-Oriented Programming (OOP) that allows a new class to inherit the properties and behaviors (fields and methods) of an existing class. The new class is called the **subclass** (or derived class), and the existing class is referred to as the **superclass** (or base class).

By using inheritance, we can achieve **reusability** of code and **method overriding**, which promotes flexibility and maintainability.

---

## Why Do We Need Inheritance in Java?

- **Code Reusability**: Inheritance allows subclasses to reuse the methods and properties of the superclass. This prevents duplication of code.
- **Extensibility**: You can add new features to an existing class without modifying it by creating a subclass that extends the superclass.
- **Maintainability**: When you fix a bug or add a feature to the superclass, it automatically applies to all its subclasses, simplifying maintenance.
- **Method Overriding**: Subclasses can provide specific implementations of methods that are already defined in their superclass, allowing polymorphism.
- **Organized Structure**: Inheritance helps to create a hierarchical structure for classes that naturally model real-world relationships (like "is-a").

---

## How Does Inheritance Work?

In Java, inheritance is achieved using the `extends` keyword. A subclass inherits non-private members (fields and methods) from the superclass.

### Syntax:
```java
class Superclass {
    // superclass members
}

class Subclass extends Superclass {
    // subclass members
}
```
The `extends` keyword indicates that the subclass inherits from the superclass.

## 

Example of Inheritance in Java

```java
// Superclass
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Subclass that inherits from Calc
class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// Main class to test inheritance
public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 5);      // Inherited from Calc
        int r2 = obj.sub(7, 3);      // Inherited from Calc
        int r3 = obj.multi(5, 3);    // Defined in AdvCalc
        int r4 = obj.div(15, 3);     // Defined in AdvCalc
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
```
Output: 
```java
9 4 15 5
```

### Explanation:
- `AdvCalc` inherits the methods `add` and `sub` from `Calc`, which allows the `AdvCalc` object to call these methods even though they are defined in the superclass.
- The `AdvCalc` class also introduces its own methods, `multi` and `div`, that extend the functionality of `Calc`.

## 
### Types of Inheritance in Java
Java supports the following types of inheritance:

1. **Single Inheritance:** A subclass inherits from one superclass.
2. **Multilevel Inheritance:** A subclass can be a superclass for another class, forming a chain of inheritance.
3. **Hierarchical Inheritance:** Multiple subclasses inherit from a single superclass.

**Note:** Java does not support multiple inheritance with classes to avoid complexity and ambiguity. However, multiple inheritance can be achieved through interfaces.
##
### Advantages of Inheritance
- **Reduces Code Duplication:** Common logic can be written in the superclass and reused by all subclasses.
- **Improves Code Organization:** Helps in organizing classes in a hierarchical manner.
- **Supports Polymorphism**: Subclasses can override methods to provide specific behavior, enabling dynamic method invocation.

## 
### Conclusion
Inheritance is a powerful feature in Java that allows developers to create hierarchical class structures, promote code reuse, and build more maintainable and flexible applications. It provides the foundation for polymorphism and method overriding, making it easier to manage complex systems.