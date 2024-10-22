// final - variable, method, class

// Declaring a final class Calc
class Calc {
    // Final method cannot be overridden in subclasses
    public final void show() {
        System.out.println("By Rishi");
    }

    // Method to add two numbers
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// AdvCalc class extends Calc
// This class cannot override the show() method because it is final in the
// parent class
class AdvCalc extends Calc {
    // This method would cause an error if uncommented
    // public void show() {
    // System.out.println("By John");
    // }
}

public class Main {
    public static void main(String[] args) {
        // Final variable cannot be reassigned
        final int num = 8;
        // Uncommenting the line below will cause a compilation error
        // num = 9; // This will result in an error: cannot assign a value to final
        // variable num

        System.out.println(num);

        // Creating an object of Calc
        Calc obj = new Calc();
        obj.show(); // Output: By Navin
        obj.add(4, 5); // Output: 9

        // Creating an object of AdvCalc
        AdvCalc advObj = new AdvCalc();
        advObj.show(); // Output: By Navin
        advObj.add(4, 5); // Output: 9
    }
}
