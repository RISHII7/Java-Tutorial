# Static Variables in Java

## What is a Static Variable?
A **static variable** in Java is a class-level variable, meaning it is associated with the class itself, not with individual instances (objects) of the class. Static variables are shared among all instances of a class, which means that all objects of the class have access to the same static variable.

### Characteristics of Static Variables:
1. **Shared Across All Instances**: A static variable is shared by all instances of the class. Any modification to the static variable reflects across all instances.
2. **Memory Allocation**: Static variables are allocated memory only once, at the time of class loading, unlike instance variables which are allocated memory each time a new object is created.
3. **Access via Class Name**: Static variables can be accessed directly using the class name without creating any instance of the class. However, they can also be accessed through objects, though it's not recommended.
4. **Scope and Lifetime**: Static variables are created when the class is loaded into memory and destroyed when the class is unloaded.

### Use Cases of Static Variables:
- **Constant Values**: Static variables are often used for constants that need to be shared across all instances, like `PI` in a `Math` class.
- **Counters**: To keep track of the number of objects created in a class.
- **Common Properties**: When all objects of a class need to share a common property (e.g., company name for an Employee class).

### Syntax for Static Variables:
```java
class ClassName {
    static datatype variableName;
}
```

### Key Points to Remember:
- Static variables are declared using the static keyword.
- They belong to the class rather than the object.
- They are shared among all instances of the class.
- Static variables can be accessed without an object using the class name.

### Syntax Example for Static Variable Declaration:
```java
class Mobile {
    static String brand; // Static variable shared by all objects
}
```
In the above example, `brand` is a static variable. All objects of the `Mobile` class will share the same `brand`.