class Laptop {
    String model;
    int price;
    String serial;

    // Corrected toString method
    @Override
    public String toString() {
        return model + " : " + price;
    }

    // Corrected equals method to override Object's equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // Check for self-comparison
        if (obj == null || getClass() != obj.getClass())
            return false; // Check for null and class match

        Laptop that = (Laptop) obj; // Cast the object to Laptop
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga1"; // Changed to "Lenovo Yoga1" for demonstration
        obj2.price = 1000;

        boolean result = obj.equals(obj2);
        System.out.println("Are the two laptops equal? " + result);

        // Displaying the output of the toString method
        System.out.println(obj.toString());
        System.out.println(obj); // Automatically calls the toString method
    }
}
