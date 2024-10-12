# Understanding If-Else Conditions in Java

This document explains the usage of `if-else` statements in Java, focusing on determining the greatest of three numbers through multiple conditional checks.

## Table of Contents

1. [Introduction](#introduction)
2. [Code Explanation](#code-explanation)
3. [Conclusion](#conclusion)

## Introduction

The `if-else` statement in Java is a fundamental control structure that allows for conditional execution of code. This document explores how to compare multiple variables using `if-else` statements to determine the largest value among them.

## Code Explanation

Below is a sample code demonstrating the use of `if-else` conditions to find the greatest of three integers:

```java
public class Main {
    public static void main(String[] args) {
        // Initialize variables x, y, and z
        int x = 8;
        int y = 7;
        int z = 8;

        // Check if x is the greatest among x, y, and z
        if (x > y && x > z) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        // Re-initialize variables for the second example
        x = 8;
        y = 7;
        z = 9;

        // Determine the greatest number among x, y, and z
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        // Re-initialize variables for the third example
        x = 8;
        y = 7;
        z = 9;

        // Another check to determine the greatest number
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
```

## Explanation of the Code
1. Variable Initialization: Three integers x, y, and z are initialized to demonstrate comparisons.
---
2. First Conditional Check:

- The first if statement checks if x is greater than both y and z. If true, it prints x; otherwise, it prints y.
- In this case, 8 is not greater than 8, so it prints 7.

---

3. Second Conditional Check:
- The next set of variables is re-initialized to x = 8, y = 7, and z = 9.
- The first condition again checks if x is the greatest. Since it is false, the program checks if y is greater than x and z, which is also false. Therefore, it prints 9.
---
4. Third Conditional Check:

- The variables are re-initialized again, and the same comparisons are made. As before, it prints 9 based on the conditions evaluated.

## Conclusion
The use of nested if-else statements in Java allows for complex decision-making processes. Understanding how to structure these conditions can help you efficiently evaluate multiple scenarios in your programming tasks. Practicing these examples will enhance your skill in using conditional statements effectively.