// Base class A
class A {
    public void show() {
        System.out.println("Class A Method");
    }
}

// Class B extends Class A
class B extends A {
    public void show() {
        System.out.println("Class B Method");
    }
}

// Class C extending Class B
// If multiple inheritance were allowed (i.e., if C could extend both A and B),
// there would be an ambiguity: which "show" method to call?
// In Java, this is prevented by allowing a class to inherit from only one
// class.
class C extends B {
    public void show() {
        System.out.println("Class C Method");
    }
}

public class Main {
    public static void main(String[] args) {
        C objC = new C();
        objC.show(); // C's method will be called, demonstrating single inheritance in action.

        B objB = new B();
        objB.show(); // B's method will be called.
    }
}
