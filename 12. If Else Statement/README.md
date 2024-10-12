# Understanding `if-else` Statements in Java

This document provides a comprehensive overview of the `if-else` statement in Java, a fundamental control flow structure that allows you to make decisions in your programs based on specific conditions.

## Table of Contents

1. [Introduction to `if-else` Statements](#introduction-to-if-else-statements)
2. [Syntax of `if-else` Statements](#syntax-of-if-else-statements)


## Introduction to `if-else` Statements

The `if-else` statement is a decision-making statement that executes a block of code based on whether a specified condition evaluates to `true` or `false`. It allows your program to take different actions based on varying conditions.

## Syntax of `if-else` Statements

The basic syntax of the `if-else` statement is as follows:

```java
if (condition) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```

## Introduction to Nested `if-else` Statements

A nested `if-else` statement is an `if-else` structure placed inside another `if` or `else` block. This allows for the evaluation of additional conditions if the previous conditions are not met. Nested `if-else` statements are useful for handling multiple levels of decision-making in a program.

## Syntax of Nested `if-else` Statements

The basic syntax of nested `if-else` statements is as follows:

```java
if (condition1) {
    // Code block for condition1 being true
    if (condition2) {
        // Code block for condition2 being true
    } else {
        // Code block for condition2 being false
    }
} else {
    // Code block for condition1 being false
}