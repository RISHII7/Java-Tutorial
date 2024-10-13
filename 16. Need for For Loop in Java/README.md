# The Need for `for` Loop in Java

In programming, performing repetitive tasks is common. Rather than writing the same code multiple times, loops provide an efficient way to repeat a block of code multiple times. In Java, the `for` loop is one of the most commonly used control structures that helps to efficiently manage such repetitions.

---

## What is a `for` Loop?

A **`for` loop** is a control flow statement that allows code to be executed repeatedly based on a condition. It is particularly useful when the number of iterations is known beforehand. The loop runs for a specified number of times and is an essential tool for simplifying repetitive tasks.

---

## Why Do We Need `for` Loops?

### 1. **Efficiency and Readability**
Without loops, we would have to manually repeat blocks of code, which makes the code longer, harder to maintain, and prone to errors. A `for` loop helps you write clean, concise, and efficient code by executing the same instructions multiple times in a controlled manner.

**Example Without a Loop**:
```java
System.out.println("Number: " + 1);
System.out.println("Number: " + 2);
System.out.println("Number: " + 3);
// Imagine doing this for 100 numbers
