class A {
    // Constructor
    public A() {
        System.out.println("Object created");
    }

    // Method to display a message
    public void show() {
        System.out.println("In A show");
    }
}

public class Main {
    public static void main(String[] args) {
        // Declare an integer variable
        int marks;
        marks = 99; // Assigning a value to marks

        // Creating an anonymous object
        new A(); // This creates an object of class A and calls the constructor

        // Calling the show method using an anonymous object
        new A().show(); // This creates another anonymous object and calls the show method

        // Creating a named object
        A obj = new A(); // This creates an object of class A and assigns it to obj

        // Calling the show method using the named object
        obj.show(); // This calls the show method on the object referred to by obj
    }
}
