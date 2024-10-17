# Inheritance in Java

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class (subclass) to inherit fields and methods from another class (superclass). It promotes code reusability and establishes a relationship between classes.

There are different types of inheritance in Java, and in this document, we will focus on **Single** and **Multilevel** Inheritance.

---

## 1. What is Single Inheritance?

**Single Inheritance** occurs when a class inherits from one superclass. In this type of inheritance, the subclass (derived class) extends a single base class (superclass) to inherit its properties and methods.

### Example:

```java
// Base class
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Derived class (Single Inheritance)
class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
```

### Explanation:
- The class `AdvCalc` inherits from the class `Calc`, gaining access to its `add()` and `sub()` methods.
- In addition, `AdvCalc` adds its own functionality, with methods for multiplication (`multi()`) and division (`div()`).

---

## 2. What is Multilevel Inheritance?
**Multilevel Inheritance** occurs when a class inherits from a subclass, which in turn inherits from another class. This forms a hierarchy of inheritance, where a derived class has a base class, and that base class is also a derived class of another class.

### Example
```java
// Base class
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Intermediate derived class (Single Inheritance)
class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// Further derived class (Multilevel Inheritance)
class VeryAdvCalc extends AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}
```

### Explanation:
- The class `VeryAdvCalc` inherits from `AdvCalc`, which itself inherits from `Calc`.
- `VeryAdvCalc` can access methods from both `AdvCalc` and `Calc` and adds its own method `power()` for exponentiation.
- This demonstrates Multilevel Inheritance, where each class builds upon the functionality of its parent class.

---

## 3. Key Points:
- **Single Inheritance** involves one superclass and one subclass.
- **Multilevel Inheritance** involves a chain of inheritance across multiple levels.
- Java does not support **multiple inheritance** (i.e., a class cannot inherit from more than one class), but interfaces provide a way to achieve similar functionality.

---

## 4. Advantages of Inheritance:
- **Code Reusability:** Inherited methods can be reused, reducing code duplication.
- **Extensibility**: Allows extending the functionality of existing classes.
- **Polymorphism:** Supports method overriding, which allows different behaviors for methods in subclasses.
- **Maintainability:** Makes the code easier to maintain by logically structuring relationships between classes.
---

## 5. Summary:
- **Single Inheritance** allows a class to inherit from only one superclass, extending its functionality.
- **Multilevel Inheritance** creates a hierarchy of classes, where each level builds upon the previous one, promoting more modular and extensible code.

---