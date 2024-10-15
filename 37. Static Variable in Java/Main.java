class Mobile {
    String brand; // Instance variable for brand
    int price; // Instance variable for price
    static String name; // Static variable for name

    // Method to display mobile details
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // Setting static variable using class name

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone"; // Static variable is shared between objects

        // Modify static variable
        obj1.name = "Phone";
        Mobile.name = "SmartPhone"; // Static variable reassigned

        // Display mobile details
        obj1.show(); // Output will use static variable
        obj2.show(); // Same static variable for both objects

        System.out.println(obj1.brand); // Display individual brand
    }
}

// Explanation:
// Instance Variables (brand and price): These are specific to each instance of
// the Mobile class. Each object will have its own brand and price.
// Static Variable (name): This is shared among all instances of the class. Any
// changes made to the static variable will affect all objects of the class.
// Method show(): This method displays the brand, price, and name. Since name is
// static, it will reflect the latest value assigned to it.
