# Understanding the `do-while` Loop in Java

In Java, the **`do-while` loop** is similar to the `while` loop, but with one key difference: it guarantees that the code inside the loop will run **at least once**, even if the condition is `false` from the beginning. This is because the condition is evaluated **after** the loop's body is executed.

---

## Structure of the `do-while` Loop

The basic syntax of a `do-while` loop in Java is as follows:

```java
do {
    // Code to be executed at least once
} while (condition);
