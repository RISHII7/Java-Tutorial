class Mobile {
    String brand;
    int price;
    String network;

    static String category; // Static variable for category shared by all instances

    public void show() {
        System.out.println(brand + " : " + price + " : " + category); // Corrected the use of static variable
    }

    public static void show1(Mobile obj) {
        System.out.println("In static method");
        System.out.println(obj.brand + " : " + obj.price + " : " + category);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.category = "SmartPhone"; // Access static variable using class name

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        Mobile.show1(obj1); // Calling static method

        System.out.println(obj1.brand);
    }
}
