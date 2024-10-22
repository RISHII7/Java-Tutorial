import other.A;

class C extends A {
    public void abc() {
        System.out.println("In class C, inherited marks: " + marks); // accessing inherited marks
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing class A
        A obj = new A();
        System.out.println("Marks from class A: " + obj.marks); // accessing default access variable
        obj.show(); // calling show method

        // Accessing class B
        B obj1 = new B();
        // Note: Cannot access obj1.marks since it doesn't have a public access
        // System.out.println(obj1.defaultMarks); // This line would cause an error

        // Accessing class C
        C obj2 = new C();
        obj2.abc(); // calling abc method which accesses inherited marks
    }
}
