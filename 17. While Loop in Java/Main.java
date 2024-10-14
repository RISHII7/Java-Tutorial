public class Main {
    public static void main(String[] args) {
        int i = 1; // Initial value of i
        
        // Removing infinite loop
        
        while (i <= 4) {
            System.out.println("Hi" + i);
            i++;
        }
        System.out.println("Bye" + i);
        
        i = 1; // Resetting i for the next while loop
        while (i <= 4) {
            System.out.println("Hi" + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }
}
