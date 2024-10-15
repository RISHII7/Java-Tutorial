class Mobile {
    String brand;
    int price;
    static String name;

    // Static block
    static {
        name = "Phone";
        System.out.println("in static block");
    }

    // Constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    // Method to display values
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Static block will automatically run when the class is first accessed

        // Creating objects of Mobile class
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        // Creating another object of Mobile class
        Mobile obj2 = new Mobile();
    }
}
