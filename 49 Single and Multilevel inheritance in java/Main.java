// Base class (Single Inheritance Example)
class Calc {
    // Method to perform addition
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Method to perform subtraction
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Derived class from Calc (Single Inheritance)
class AdvCalc extends Calc {
    // Method to perform multiplication
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    // Method to perform division
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// Further derived class from AdvCalc (Multilevel Inheritance)
class VeryAdvCalc extends AdvCalc {
    // Method to perform power calculation
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Multilevel Inheritance: VeryAdvCalc extends AdvCalc, AdvCalc extends Calc
        VeryAdvCalc obj = new VeryAdvCalc();

        // Calling methods from all three classes
        int r1 = obj.add(4, 5); // From Calc class
        int r2 = obj.sub(7, 3); // From Calc class
        int r3 = obj.multi(5, 3); // From AdvCalc class
        int r4 = obj.div(15, 3); // From AdvCalc class
        double r5 = obj.power(4, 2); // From VeryAdvCalc class

        // Displaying the results
        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
        System.out.println("Power: " + r5);
    }
}
