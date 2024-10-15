# StringBuffer and StringBuilder in Java

In Java, strings are immutable, meaning that once a `String` object is created, it cannot be changed. When string manipulation is required (such as concatenation or deletion of characters), using `String` may lead to the creation of many intermediate `String` objects, which can be inefficient in terms of memory and performance. To overcome this issue, Java provides two classes: `StringBuffer` and `StringBuilder`.

## StringBuffer

### Overview:
- **StringBuffer** is a thread-safe, mutable sequence of characters. 
- It can be modified after creation, making it suitable for scenarios where strings undergo multiple modifications.
- It ensures that operations on the buffer are synchronized, meaning that multiple threads cannot access or modify the buffer simultaneously.

### Characteristics:
- **Thread-Safety**: `StringBuffer` is synchronized, making it safe for use in multi-threaded environments.
- **Performance**: Due to synchronization, `StringBuffer` is slower than `StringBuilder` in single-threaded scenarios.
- **Mutability**: The content of the `StringBuffer` can be changed without creating new objects.

### Common Methods:
- `append(String str)`: Appends the specified string to this sequence.
- `insert(int offset, String str)`: Inserts the specified string at the specified position.
- `replace(int start, int end, String str)`: Replaces the characters in a substring of this sequence with characters in the specified string.
- `delete(int start, int end)`: Removes the characters in a substring of this sequence.
- `reverse()`: Reverses the sequence of characters.

### Syntax:
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
```

# StringBuilder in Java

## Overview:
`StringBuilder` is a mutable sequence of characters in Java that allows for efficient string manipulation. Unlike `String`, which is immutable (meaning that once created, it cannot be changed), `StringBuilder` can be modified without creating new objects. This makes it ideal for scenarios where strings need to be frequently appended, inserted, or altered.

`StringBuilder` is part of the `java.lang` package and was introduced in Java 5 to improve performance in single-threaded applications by providing an alternative to `StringBuffer`.

## Characteristics:
- **Mutability**: Unlike `String`, the contents of `StringBuilder` can be changed after creation.
- **Non-Thread-Safe**: `StringBuilder` is not synchronized, meaning it is not thread-safe. This makes it faster than `StringBuffer` in single-threaded applications, but it should not be used in multi-threaded environments where multiple threads could access it simultaneously.
- **Performance**: Since it does not have the overhead of synchronization like `StringBuffer`, `StringBuilder` is more efficient in terms of speed for string manipulation tasks in single-threaded programs.

## Common Methods:

### 1. `append(String str)`
This method appends the specified string to the current sequence of characters in the `StringBuilder`.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);  // Output: Hello World
```
##
### 2. `insert(int offset, String str)`
Inserts the specified string at the given position in the `StringBuilder`.
```java
StringBuilder sb = new StringBuilder("Hello");
sb.insert(5, " World");
System.out.println(sb);  // Output: Hello World
```
##
### 3. `replace(int start, int end, String str)`
Replaces the characters in a substring of this sequence with characters in the specified string.
```java
StringBuilder sb = new StringBuilder("Hello World");
sb.replace(6, 11, "Java");
System.out.println(sb);  // Output: Hello Java
```
##
### 4. `delete(int start, int end)`
Removes the characters from the `StringBuilder` between the specified start and end indices.
```java
StringBuilder sb = new StringBuilder("Hello World");
sb.delete(5, 11);
System.out.println(sb);  // Output: Hello
```
## 
### 5. `reverse()`
Reverses the characters in the `StringBuilder`.
```java
StringBuilder sb = new StringBuilder("Hello");
sb.reverse();
System.out.println(sb);  // Output: olleH
```
##
### 6. `capacity()`
Returns the current capacity of the `StringBuilder`, which is the amount of memory allocated for the character sequence.
```java
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity());  // Output: 16 (default capacity)
```
##
### 7. `length()`
Returns the number of characters currently in the `StringBuilder`.
```java
StringBuilder sb = new StringBuilder("Hello");
System.out.println(sb.length());  // Output: 5
```
##
### 8. `setLength(int newLength)`
Sets the length of the character sequence. If the new length is smaller, the string is truncated.
```java
StringBuilder sb = new StringBuilder("Hello");
sb.setLength(3);
System.out.println(sb);  // Output: Hel
```
##
### When to Use:
- **Performance:** Use `StringBuilder` when you need high-performance string manipulation in single-threaded environments.
- **Mutability:** Use `StringBuilder` when the string needs to be modified multiple times (e.g., in loops or concatenation-heavy scenarios).

