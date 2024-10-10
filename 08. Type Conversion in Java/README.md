# Type Conversion in Java

Type conversion in Java refers to the process of converting one data type into another. It can happen in two main ways:
- **Widening Conversion** (automatic/implicit conversion)
- **Narrowing Conversion** (manual/explicit conversion)

Type conversions ensure that Java programs can handle different data types effectively, but developers must manage them carefully to prevent data loss or unexpected results.

---

## 1. Widening Conversion (Implicit Type Conversion)

Widening conversion is also known as **implicit conversion** or **automatic conversion**. It occurs when a smaller data type is automatically converted into a larger data type. This type of conversion is safe because no data is lost, and it happens without the need for explicit casting.

### 1.1 Widening Conversion Hierarchy

In Java, widening happens automatically in the following order:

- `byte` → `short` → `int` → `long` → `float` → `double`
- `char` → `int` → `long` → `float` → `double`

# Narrowing Conversion in Java

In Java, **narrowing conversion** refers to the process of converting a larger data type into a smaller data type. Since this conversion may lead to data loss (due to overflow or truncation), it requires explicit casting by the programmer.

Narrowing conversions are considered **explicit conversions** because the programmer must manually specify the type conversion using a cast.

---

## 1. What is Narrowing Conversion?

Narrowing occurs when we need to convert a data type that occupies more memory (a larger data type) into one that occupies less memory (a smaller data type). This type of conversion can cause loss of precision or values, so it requires special care.

### 1.1 When to Use Narrowing Conversion?

Narrowing conversions are typically used when:
- The larger type contains values that fall within the range of the smaller type.
- Precision (such as decimal points) needs to be truncated.
- Performance optimizations where smaller types may improve memory efficiency.

---

## 2. Narrowing Conversion Hierarchy

Narrowing conversion in Java follows this hierarchy:

- `double` → `float` → `long` → `int` → `short` → `byte`
- `int` → `char`

---

## 3. Syntax for Narrowing Conversion

Since narrowing conversion can result in data loss, Java requires an **explicit cast** for such conversions. The syntax for narrowing conversion is:

```java
smallerType variable = (smallerType) largerTypeValue;
