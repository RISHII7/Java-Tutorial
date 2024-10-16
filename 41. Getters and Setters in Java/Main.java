class Human {
    // Private fields to ensure encapsulation
    private int age;
    private String name;

    // Constructor (optional, for initializing values)
    public Human() {
        this.age = 0;
        this.name = "Unknown";
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        this.age = age; // 'this' keyword used to refer to the instance variable
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();

        // Set values using setters
        obj.setAge(30);
        obj.setName("Reddy");

        // Get values using getters
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }
}
