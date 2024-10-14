public class Main {
    public static void main(String[] args) {
        // Initializing the array with values
        int nums[] = { 3, 7, 2, 4 };

        // Modifying the second element (index 1)
        nums[1] = 6;
        System.out.println("Updated value at index 1: " + nums[1]);

        // re-assigning the nums array (declaration is not repeated)
        nums = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // Printing values using individual System.out.println statements
        System.out.println("Value at index 0: " + nums[0]);
        System.out.println("Value at index 1: " + nums[1]);
        System.out.println("Value at index 2: " + nums[2]);
        System.out.println("Value at index 3: " + nums[3]);
        System.out.println(" ");

        // Printing the values using loop
        System.out.println("Values of the array using a loop:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Value at index" + i + ": " + nums[i]);
        }
    }
}
