public class Main {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        // Fill the array with random numbers between 0 and 99
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100); // Properly generate random numbers between 0 and 99
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println(); // Blank line for separation

        // Print array using traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        System.out.println(); // Blank line for separation

        // Print array using enhanced for loop (for-each loop)
        System.out.println("Using enhanced for loop:");
        for (int[] row : nums) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
