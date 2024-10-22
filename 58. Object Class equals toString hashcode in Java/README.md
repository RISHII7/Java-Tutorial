# Object Class in Java

In Java, every class implicitly inherits from the `Object` class if no other class is specified. The `Object` class provides a few essential methods that every Java class inherits and can override, including `equals()`, `toString()`, and `hashCode()`.

## 1. `equals()` Method

The `equals()` method is used to compare two objects for equality. By default, it compares memory addresses (i.e., reference equality). However, it is typically overridden in custom classes to compare the actual data within the objects (i.e., content equality).

### Syntax
```java
public boolean equals(Object obj)
```

**Example:**
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals method to compare content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);

        System.out.println(p1.equals(p2)); // true, because content is the same
    }
}
```
### Key Points:
- By default, `equals()` checks if two object references point to the same memory location (reference equality).
- It is common to override `equals()` in custom classes to perform a deeper comparison of the object’s fields (content equality).
- When overriding `equals()`, you should also override hashCode() to maintain consistency

## 2. `toString()` Method
The `toString()` method is used to provide a string representation of an object. By default, it returns the class name followed by the "@" symbol and the object's memory address in hexadecimal format.

### Syntax
```java
public String toString()
```

### Example:
```java 
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString method to provide meaningful output
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John", 25);
        System.out.println(p); // Person{name='John', age=25}
    }
}
```

### Key Points:
- By default, `toString()` returns the class name and memory address, but this can be overridden to provide a meaningful string representation of the object.
- A good practice is to override `toString()` for debugging or logging purposes, so that an object can be printed in a more readable format.

## 3. `hashCode()` Method
The `hashCode()` method returns an integer value (hash code) for the object. It is used in hash-based collections like `HashMap`, `HashSet`, etc. The hash code is used to find objects quickly in these collections.

### Syntax
```java
public int hashCode()
```

### Example:
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding hashCode method
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John", 25);
        System.out.println(p.hashCode()); // Unique hash code for this object
    }
}
```

## Key Points:
- The default implementation of `hashCode()` generates a hash code based on the memory address of the object.
- When overriding `equals()`, you should always override `hashCode()` to maintain the general contract of the `hashCode()`method:
- If two objects are equal according to the `equals()` method, they must have the same hash code.
- If two objects have the same hash code, they are not necessarily equal according to `equals()`.

## 4. Best Practices for `equals()`, `toString()`, and `hashCode()`
- Always override `hashCode()` when overriding `equals()`. Failing to do so can lead to incorrect behavior when storing objects in hash-based collections such as `HashMap`, `HashSet`, etc.
- Override `toString()` for a readable representation of your objects, which can help during debugging and logging.
- Use IDEs or tools like Lombok to generate `equals()`, `toString()`, and `hashCode()` methods, as they can save time and ensure correctness.


### Conclusion
The Object class provides essential methods (`equals()`, `toString()`, and `hashCode()`) that play a significant role in Java object comparison, representation, and storage. Properly overriding these methods ensures the correct behavior of your custom classes, especially when working with collections and debugging.