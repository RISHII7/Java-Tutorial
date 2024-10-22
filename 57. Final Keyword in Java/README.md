# Final Keyword in Java

The `final` keyword in Java is a non-access modifier that can be applied to variables, methods, and classes. It is used to indicate that the entity it modifies cannot be changed, overridden, or inherited. 

## 1. Final Variables

When a variable is declared as `final`, its value cannot be modified once it is initialized. This is useful for defining constants.

### Example
```java
final int MAX_VALUE = 100;
// MAX_VALUE = 200; // This will cause a compilation error
```

### **Key Points:**
- A final variable must be initialized when it is declared or within a constructor.
- Once assigned, a final variable's value cannot change.
- Final variables can be used in conjunction with other modifiers (e.g., `static final` for constants).
##
## 2. Final Methods
A method declared as `final` cannot be overridden by subclasses. This ensures that the implementation of the method remains consistent across different classes.

**Example**
```java
class Parent {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // This will cause a compilation error
    // public void display() {
    //     System.out.println("Attempting to override a final method.");
    // }
}
```
### Key Points:
- Final methods are useful when you want to lock down the implementation to prevent any alteration by subclasses.
- Even if a method is final, it can still be overloaded in the same class.

##

## 3. Final Classes
A class declared as `final` cannot be subclassed. This means that no other class can extend a final class.

**Example**:
```java
final class Utility {
    public static void printMessage() {
        System.out.println("This is a utility class.");
    }
}

// This will cause a compilation error
// class ExtendedUtility extends Utility {
// }
```

### Key Points:
- Final classes are typically used for utility or helper classes.
- Marking a class as final can enhance performance by avoiding the overhead of dynamic method dispatch.

## 

## 4. Usage Scenarios
**When to Use Final:**
- **Constants:** Use `final` for variables that should not change throughout the program.
- **Immutable Classes:** If you want to create immutable classes (like `String`), consider making the class final and its fields final.
- **Safety in Inheritance:** Use final methods and classes when you want to ensure that certain methods cannot be altered or certain classes cannot be extended.

## 

## Conclusion
The final keyword is a powerful tool in Java that helps maintain immutability and prevents unwanted modifications to variables, methods, and classes. By using final effectively, you can create more robust and secure applications.