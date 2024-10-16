# Naming Conventions in Java

Naming conventions are essential in programming as they promote readability and maintainability of code. Following a consistent naming pattern helps developers understand the code more easily, especially when collaborating in teams. This document outlines the common naming conventions used in Java.

## 1. Class and Interface Names

- **Convention**: Use **PascalCase** (capitalize the first letter of each word).
- **Example**:
```java
  public class Student {
      // Class definition
  }

  public interface Shape {
      // Interface definition
  }
  ```

## 2. Method Names
- **Convention:** Use camelCase (start with a lowercase letter and capitalize the first letter of each subsequent word).
- **Example**:
```java
public void calculateTotal() {
    // Method definition
}

public int getAge() {
    // Method definition
}
  ```

## 3. Variable Names
- **Convention:** Use camelCase for variable names, starting with a lowercase letter.
- **Example:**
```java
int studentAge;
String firstName;
double totalAmount;
```
## 4. Constants
- **Convention:** Use UPPERCASE letters, with words separated by underscores.
- **Example:**
```java
public static final int MAX_VALUE = 100;
public static final String COMPANY_NAME = "Tech Corp";
```

## 5.  Packages
- **Convention:** Use all lowercase letters, with words separated by dots. Typically, the package name should start with the company's domain name in reverse.
- **Example:**
```java
package com.example.project;
```

## 6. Enum Types
- **Convention:** Use PascalCase for enum names and UPPERCASE for enum constants.
- **Example:**
```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```

## 7. Private Variables
- **Convention:** Use camelCase but may prefix with an underscore _ to denote private access.
- **Example:**
```java
private int _count;
private String _name;
```

## Conclusion
Following naming conventions in Java is crucial for creating clean, understandable, and maintainable code. By adhering to these conventions, developers can foster better collaboration and code quality, making it easier for teams to work together and for future maintainers to understand the codebase.
