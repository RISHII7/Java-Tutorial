// Superclass A
class A {
    // Default constructor of class A
    public A() {
        System.out.println("in A (default constructor)");
    }

    // Parameterized constructor of class A
    public A(int n) {
        System.out.println("in A (parameterized constructor with int: " + n + ")");
    }
}

// Subclass B extends A
class B extends A {
    // Default constructor of class B
    public B() {
        super(); // Calls default constructor of class A
        System.out.println("in B (default constructor)");
    }

    // Parameterized constructor of class B
    public B(int n) {
        this(); // Calls default constructor of class B
        System.out.println("in B (parameterized constructor with int: " + n + ")");
    }
}

// Subclass C extends B
class C extends B {
    // Default constructor of class C
    public C() {
        super(5); // Calls parameterized constructor of class B
        System.out.println("in C (default constructor)");
    }

    // Parameterized constructor of class C
    public C(int n) {
        this(); // Calls default constructor of class C
        System.out.println("in C (parameterized constructor with int: " + n + ")");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating object of C using default constructor:");
        C obj1 = new C(); // Will invoke constructors chaining from C -> B -> A

        System.out.println("\nCreating object of C using parameterized constructor:");
        C obj2 = new C(10); // Will invoke constructors chaining from C(int) -> C() -> B(int) -> B() -> A
    }
}
