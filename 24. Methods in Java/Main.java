// Define the Computer class
class Computer {
    // Method to simulate playing music
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    // Method to return a pen based on the cost
    public String getMeAPen(int cost) {
        // If the cost is greater than or equal to 10, return "Pen"
        if (cost >= 10) {
            return "Pen";
        } else {
            // Otherwise, return "Nothing"
            return "Nothing";
        }
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Computer class
        Computer obj = new Computer();

        // Call the playMusic method
        obj.playMusic();

        // Call the getMeAPen method with a cost of 10 and store the result
        String src = obj.getMeAPen(2);

        // Print the result of getMeAPen
        System.out.println(src);
    }
}
