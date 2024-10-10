# Understanding Relational Operators in Java

This document provides a comprehensive overview of relational operators in Java. Relational operators are used to compare two values and return a boolean result (`true` or `false`). They are essential for control flow and decision-making in programming.

## Table of Contents

1. [Introduction to Relational Operators](#introduction-to-relational-operators)
2. [Types of Relational Operators](#types-of-relational-operators)
3. [Examples of Relational Operations](#examples-of-relational-operations)
4. [Conclusion](#conclusion)

## Introduction to Relational Operators

Relational operators allow you to compare two operands. The result of a relational operation is a boolean value that indicates whether the comparison is `true` or `false`. These operators are commonly used in conditional statements, loops, and other control structures to control the flow of the program.

## Types of Relational Operators

Java supports the following relational operators:

| Operator | Description                                   | Example        | Result   |
|----------|-----------------------------------------------|----------------|----------|
| `==`     | Equal to                                     | `5 == 5`       | `true`   |
| `!=`     | Not equal to                                 | `5 != 3`       | `true`   |
| `>`      | Greater than                                 | `5 > 3`        | `true`   |
| `<`      | Less than                                    | `5 < 3`        | `false`  |
| `>=`     | Greater than or equal to                     | `5 >= 5`       | `true`   |
| `<=`     | Less than or equal to                        | `5 <= 3`       | `false`  |

### Operator Descriptions

- **Equal to (`==`)**: Returns `true` if both operands are equal.
- **Not equal to (`!=`)**: Returns `true` if operands are not equal.
- **Greater than (`>`)**: Returns `true` if the left operand is greater than the right.
- **Less than (`<`)**: Returns `true` if the left operand is less than the right.
- **Greater than or equal to (`>=`)**: Returns `true` if the left operand is greater than or equal to the right.
- **Less than or equal to (`<=`)**: Returns `true` if the left operand is less than or equal to the right.

## Examples of Relational Operations

Below is an example Java program that demonstrates the use of various relational operators:

```java
public class Main {
    public static void main(String[] args) {
        int x = 6; // Initializing variable x with value 6
        int y = 5; // Initializing variable y with value 5

        // Using relational operators to compare x and y
        boolean resultEqual = x == y; // Equal to
        boolean resultNotEqual = x != y; // Not equal to
        boolean resultGreaterThan = x > y; // Greater than
        boolean resultLessThan = x < y; // Less than
        boolean resultGreaterOrEqual = x >= y; // Greater than or equal to
        boolean resultLessOrEqual = x <= y; // Less than or equal to

        // Output the results of the comparisons
        System.out.println("Is x equal to y? " + resultEqual); // Output: false
        System.out.println("Is x not equal to y? " + resultNotEqual); // Output: true
        System.out.println("Is x greater than y? " + resultGreaterThan); // Output: true
        System.out.println("Is x less than y? " + resultLessThan); // Output: false
        System.out.println("Is x greater than or equal to y? " + resultGreaterOrEqual); // Output: true
        System.out.println("Is x less than or equal to y? " + resultLessOrEqual); // Output: false

        double a = 8.8; // Initializing variable a with value 8.8
        double b = 9.8; // Initializing variable b with value 9.8

        // Using relational operators to compare a and b
        boolean resultAGreaterOrEqual = a >= b; // Greater than or equal to
        boolean resultALessOrEqual = a <= b; // Less than or equal to

        // Output the results of the comparisons
        System.out.println("Is a greater than or equal to b? " + resultAGreaterOrEqual); // Output: false
        System.out.println("Is a less than or equal to b? " + resultALessOrEqual); // Output: true
    }
}
