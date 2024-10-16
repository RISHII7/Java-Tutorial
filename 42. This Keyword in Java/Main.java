class Human {
    // Private fields for encapsulation
    private int age;
    private String name;

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with an extra parameter (though it's not commonly
    // needed)
    public void setAge(int age, Human obj) {
        // Using the passed object to set age
        obj.age = age;
        // Assign age to the current object
        this.age = age;
    }

    // Regular setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Human object
        Human obj = new Human();

        // Set the age using the setter methods
        obj.setAge(30, obj); // Setting age using both object and value
        obj.setAge(25); // Setting age directly

        // Set the name
        obj.setName("Reddy");

        // Print age and name using the getters
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
