# Default vs Parameterized Constructor in Java

In Java, constructors are special methods used to initialize objects. They are called when an instance of a class is created. There are two main types of constructors: **default constructors** and **parameterized constructors**. This document will explain the differences between the two, along with examples.

## Default Constructor

A **default constructor** is a constructor that does not take any arguments. If no constructor is explicitly defined in a class, the Java compiler automatically provides a default constructor. The default constructor initializes the object with default values.

### Characteristics:
- It has no parameters.
- It is used to initialize instance variables with default values.
- It is automatically created by the Java compiler if no constructors are defined.

### Example:

```java
class Human {
    private int age;
    private String name;

    // Default constructor
    public Human() {
        age = 12; // Default age
        name = "John"; // Default name
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Human obj = new Human();
        obj.display(); // Output: Name: John, Age: 12
    }
}
```
### Explanation:
In the example above, the `Human` class has a default constructor that initializes `age` to `12` and `name` to `"John"`. When an object of the `Human` class is created using the default constructor, these values are assigned automatically.
##
### Parameterized Constructor
A parameterized constructor is a constructor that takes one or more parameters. This type of constructor allows you to pass values to initialize instance variables when an object is created.

### Characteristics:
- It has parameters, which can be used to initialize object attributes with specific values.
- Multiple parameterized constructors can be defined in the same class (constructor overloading).

### Example
```java
class Human {
    private int age;
    private String name;

    // Parameterized constructor
    public Human(int age, String name) {
        this.age = age; // Initializing age
        this.name = name; // Initializing name
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Human obj1 = new Human(18, "Navin");
        obj1.display(); // Output: Name: Navin, Age: 18

        Human obj2 = new Human(30, "Reddy");
        obj2.display(); // Output: Name: Reddy, Age: 30
    }
}
```

### Explanation:
In the example above, the `Human` class has a parameterized constructor that takes `age` and `name` as parameters. When creating an object of the `Human` class, you can specify the values for these parameters, which are then assigned to the instance variables.
