

access_modifiers_content = """
# Access Modifiers in Java

## Table of Contents
1. [Introduction](#introduction)
2. [Types of Access Modifiers](#types-of-access-modifiers)
    - [Public](#public)
    - [Protected](#protected)
    - [Default](#default)
    - [Private](#private)
3. [Comparison of Access Modifiers](#comparison-of-access-modifiers)
4. [Examples](#examples)
    - [Example of Public Modifier](#example-of-public-modifier)
    - [Example of Protected Modifier](#example-of-protected-modifier)
    - [Example of Default Modifier](#example-of-default-modifier)
    - [Example of Private Modifier](#example-of-private-modifier)
5. [Conclusion](#conclusion)

---

## Introduction

Access modifiers in Java are keywords used to define the accessibility or scope of classes, methods, and other members. They help in encapsulation, which is one of the core principles of object-oriented programming (OOP). By controlling access, you can protect your data and ensure that only intended parts of your code can interact with it.

Java has four main access modifiers:

1. **Public**: Accessible from any other class.
2. **Protected**: Accessible within the same package and by subclasses.
3. **Default**: Accessible only within the same package (no modifier specified).
4. **Private**: Accessible only within the class itself.

---

## Types of Access Modifiers

### Public
- **Definition**: The `public` modifier allows a class, method, or variable to be accessible from any other class in any package.
- **Usage**: Use this modifier when you want to expose a class or method to the entire application.

### Protected
- **Definition**: The `protected` modifier allows access to the member variables and methods from the same package and also from subclasses (even if they are in different packages).
- **Usage**: Use this modifier when you want to restrict access but still allow subclasses to inherit functionality.

### Default
- **Definition**: If no access modifier is specified, Java applies the default access level. Members with default access are accessible only within their own package.
- **Usage**: Use default access when you want to limit visibility to classes in the same package without exposing them to the entire application.

### Private
- **Definition**: The `private` modifier restricts the visibility of a member to the class it is declared in. No other class can access private members, not even subclasses.
- **Usage**: Use this modifier to encapsulate data and prevent access from outside the class.

---

## Comparison of Access Modifiers

| Modifier    | Class | Package | Subclass | World |
|-------------|-------|---------|----------|-------|
| **Public**  | Yes   | Yes     | Yes      | Yes   |
| **Protected**| Yes  | Yes     | Yes      | No    |
| **Default** | Yes   | Yes     | No       | No    |
| **Private** | Yes   | No      | No       | No    |

---

## Examples

### Example of Public Modifier
```java
// PublicExample.java
public class PublicExample {
    public void display() {
        System.out.println("Public method called");
    }
}

// TestPublic.java
public class TestPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display(); // Accessible from any class
    }
}
```

## Example of Protected Modifier:
```java
// ProtectedExample.java
public class ProtectedExample {
    protected void display() {
        System.out.println("Protected method called");
    }
}

// SubClass.java
class SubClass extends ProtectedExample {
    public void callProtected() {
        display(); // Accessible in subclass
    }
}

// TestProtected.java
public class TestProtected {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.callProtected(); // Call protected method
    }
}
```

## Example of  default modifier:
```java
// DefaultExample.java
class DefaultExample {
    void display() {
        System.out.println("Default method called");
    }
}

// TestDefault.java
public class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display(); // Accessible within the same package
    }
}
```
## Example of  private modifier:
```java
// PrivateExample.java
public class PrivateExample {
    private void display() {
        System.out.println("Private method called");
    }
    
    public void callDisplay() {
        display(); // Accessible within the same class
    }
}

// TestPrivate.java
public class TestPrivate {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.callDisplay(); // Can access through public method
        // obj.display(); // Not accessible, would cause a compilation error
    }
}
```

## Conclusion
Access modifiers play a crucial role in encapsulation and data hiding in Java. Understanding how to use these modifiers effectively helps you design secure and maintainable applications. By controlling access levels, you can ensure that your classes and their members are used appropriately throughout your codebase.

Knowing when to use `public`, `protected`, `default`, and `private` access modifiers allows you to create a well-structured and easy-to-understand Java program.
