# Creation of an Array in Java

In Java, an array is a data structure that allows you to store multiple values of the same type in a single variable. This is particularly useful when you need to manage a collection of related data, such as a list of scores, names, or any other type of items. 

## Types of Arrays



### 1. Single-Dimensional Arrays

A single-dimensional array is a linear collection of elements. You can think of it as a list of items, where each item can be accessed by its index.

#### Creation of Single-Dimensional Array

There are two ways to create a single-dimensional array in Java:

**a. Declaration and Initialization at the Same Time:**

You can declare and initialize an array in one line:

```java
int[] nums = {3, 7, 2, 4}; // Array of integers
```
In this example, nums is an array of integers initialized with four values: 3, 7, 2, and 4.

**b. Declaration Followed by Initialization:**

You can also declare an array first and then allocate memory for it using the new keyword:

```java
int[] nums = new int[4]; // Declaration
nums[0] = 3; // Initialization
nums[1] = 7;
nums[2] = 2;
nums[3] = 4;
```

Here, an integer array nums is declared with a size of 4, and then each element is initialized individually.