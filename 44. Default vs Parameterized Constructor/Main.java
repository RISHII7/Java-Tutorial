// Class representing a Human
class Human {
    private int age; // Attribute to store age
    private String name; // Attribute to store name

    // Default constructor
    public Human() {
        age = 12; // Set default age
        name = "John"; // Set default name
        System.out.println("In default constructor");
    }

    // Parameterized constructor that initializes name
    public Human(String name) {
        this.age = age; // This will still be default (0)
        this.name = name; // Initialize name with the provided value
    }

    // Parameterized constructor that initializes age and name
    public Human(int age, String name) {
        this.age = age; // Initialize age with the provided value
        this.name = name; // Initialize name with the provided value
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void SetAge(int age) {
        this.age = age; // Set age using the setter
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name; // Set name using the setter
    }
}

// Main class to demonstrate the use of constructors
public class Main {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Human obj = new Human(); // Calls default constructor
        // Creating an object using the parameterized constructor
        Human obj1 = new Human(18, "Navin"); // Calls parameterized constructor

        // Print default object's name and age
        System.out.println(obj.getName() + " : " + obj.getAge()); // Output: John : 12
        // Print parameterized object's name and age
        System.out.println(obj1.getName() + " : " + obj1.getAge()); // Output: Navin : 18

        // Updating the name and age of the default object
        obj.SetAge(30); // Set age to 30
        obj.setName("Reddy"); // Set name to Reddy

        // Print updated object's name and age
        System.out.println(obj.getName() + " : " + obj.getAge()); // Output: Reddy : 30
    }
}
