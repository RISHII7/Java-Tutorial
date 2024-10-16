# Anonymous Objects in Java

## Introduction
In Java, an **anonymous object** is an object that is created without a reference variable. This means that once the object is created, it cannot be referenced again since there is no variable holding its address. Anonymous objects are useful when you want to call a method only once and do not need to retain the object's reference for future use.

## Characteristics of Anonymous Objects
- **No Reference**: An anonymous object cannot be referenced later in the program as it does not have a variable name associated with it.
- **Memory Management**: Since anonymous objects are not referenced by any variable, they are eligible for garbage collection as soon as they are no longer in use.
- **Common Use Case**: Typically used for temporary operations, such as invoking a method or calling a constructor when the object will not be needed afterward.

## Creating Anonymous Objects
Anonymous objects can be created by instantiating a class directly in an expression without assigning it to a variable.

### Example
Here’s a simple example to illustrate the use of anonymous objects in Java:

```java
class A {
    // Constructor
    public A() {
        System.out.println("Object created");
    }

    // Method to display a message
    public void show() {
        System.out.println("In A show");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating an anonymous object
        new A(); // Calls the constructor and prints "Object created"

        // Calling the show method using an anonymous object
        new A().show(); // Creates another anonymous object and calls the show method

        // Creating a named object
        A obj = new A(); // This creates a named object of class A

        // Calling the show method using the named object
        obj.show(); // Calls the show method on the named object
    }
}
```
### Output
When the above code is executed, the output will be:
```css
Object created
Object created
In A show
Object created
In A show
```

### Explanation of the Example
1. **Class Declaration:**
- The class `A` has a constructor that prints "Object created" and a method `show` that prints "In A show".

2. **Anonymous Object Creation:**
- `new A();` creates an anonymous object, invoking the constructor and printing "Object created". Since there’s no reference, we cannot call any methods on this object later.
- `new A().show();` creates another anonymous object and immediately calls the `show` method on it. This prints "In A show".

3. **Named Object Creation:**
- `A obj = new A();` creates a named object `obj`, allowing subsequent method calls on this object. When we call `obj.show(),` it prints "In A show".

### Advantages of Anonymous Objects
- **Simplified Code:** 
When you only need to perform a single operation with an object, using an anonymous object can lead to cleaner code without the need to declare additional variables.
- **Memory Efficiency:** Since anonymous objects are not retained in memory, they can help optimize resource usage in cases where object references are unnecessary.

### Conclusion
Anonymous objects in Java provide a way to create objects that are used immediately and discarded without needing a reference. They are particularly useful for single-use operations where maintaining the object's state is not required.