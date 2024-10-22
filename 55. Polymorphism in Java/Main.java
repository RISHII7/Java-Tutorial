// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Class to demonstrate method overloading
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Demonstrating method overriding (runtime polymorphism)
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows

        // Demonstrating method overloading (compile-time polymorphism)
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3)); // Outputs: 5
        System.out.println("Sum of 2, 3 and 4: " + calculator.add(2, 3, 4)); // Outputs: 9
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5)); // Outputs: 6.0
    }
}
