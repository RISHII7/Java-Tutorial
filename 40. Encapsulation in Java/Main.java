class Human {
    // Private variables (for encapsulation)
    private int age;
    private String name;

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Human object
        Human obj = new Human();

        // Use setter methods to set the age and name
        obj.setAge(30);
        obj.setName("Rishi");

        // Print the values using getter methods
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
