// Class to demonstrate Stack and Heap concepts
class Main {

    // Static method to show how stack and heap work
    public static void main(String[] args) {
        
        // Local primitive variables (stored in the Stack)
        int a = 10;  
        int b = 20;

        // Printing the local variables
        System.out.println("a = " + a);  // a is stored in the Stack
        System.out.println("b = " + b);  // b is stored in the Stack

        // Creating an object (stored in the Heap)
        MyClass obj1 = new MyClass();
        obj1.value = 100;  // obj1 is a reference to the object in the Heap
        System.out.println("obj1 value = " + obj1.value);  // Accessing the value stored in the Heap

        // Creating another object
        MyClass obj2 = new MyClass();
        obj2.value = 200;  // obj2 points to a different object in the Heap
        System.out.println("obj2 value = " + obj2.value);  // Accessing the value of obj2 in the Heap

        // Modifying the object referred by obj1
        obj1.value = 300;  // Changing the value in the Heap
        System.out.println("Updated obj1 value = " + obj1.value);
    }
}

// Custom class to show objects on the Heap
class MyClass {
    int value;  // This instance variable will be stored in the Heap
}
