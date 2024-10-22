class Computer {
    // Base class for Computer-related entities
}

class Laptop extends Computer {
    // Laptop class inherits from Computer
}

class A {
    // Base class A
    public void show() {
        // Method to display a message from class A
        System.out.println("in A show");
    }
}

class B extends A {
    // Class B inherits from A and overrides the show method
    @Override
    public void show() {
        // Method to display a message from class B
        System.out.println("in B show");
    }
}

class C extends A {
    // Class C inherits from A and overrides the show method
    @Override
    public void show() {
        // Method to display a message from class C
        System.out.println("in C show");
    }
}

class D {
    // Class D is a separate class with no methods
}

public class Main {
    public static void main(String[] args) {
        A obj = new B(); // Creating an object of class B but referencing it as type A
        obj.show(); // Output: in B show (runtime polymorphism)

        obj = new A(); // Creating an object of class A
        obj.show(); // Output: in A show

        obj = new B(); // Changing the reference to point to an object of class B
        obj.show(); // Output: in B show

        obj = new C(); // Changing the reference to point to an object of class C
        obj.show(); // Output: in C show

        // Uncommenting the line below will cause a compile-time error
        // obj = new D(); // This line will not work since D does not extend A

        Laptop obj1 = new Laptop(); // Creates a Laptop object
        Computer obj2 = new Laptop(); // Upcasting Laptop to Computer
    }
}
