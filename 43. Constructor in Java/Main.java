// Class definition for Human
class Human {
    // Private attributes to encapsulate the data
    private int age; // Attribute to store the age of the human
    private String name; // Attribute to store the name of the human

    // Constructor for the Human class
    public Human() {
        age = 12; // Initialize age to 12
        name = "John"; // Initialize name to "John"
        System.out.println("in constructor"); // Print message indicating constructor execution
    }

    // Getter method for age
    public int getAge() {
        return age; // Return the current age
    }

    // Setter method for age
    public void SetAge(int age) {
        this.age = age; // Set the age attribute using the parameter
    }

    // Getter method for name
    public String getName() {
        return name; // Return the current name
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name; // Set the name attribute using the parameter
    }
}

// Main class to demonstrate the functionality of the Human class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Human class
        Human obj = new Human(); // obj is initialized with default values (age=12, name="John")
        Human obj1 = new Human(); // obj1 is also initialized with default values

        // Display the name and age of the first human object
        System.out.println(obj.getName() + " : " + obj.getAge());

        // Modify the attributes of the first human object using setter methods
        obj.SetAge(30); // Set age to 30
        obj.setName("Reddy"); // Set name to "Reddy"

        // Display the updated name and age of the first human object
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
