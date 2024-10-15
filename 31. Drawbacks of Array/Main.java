public class Main {
    public static void main(String[] args) {

        // Fixed Size: Once an array is created, its size cannot be changed
        int[] fixedSizeArray = new int[5];

        // Trying to add more elements than the fixed size would lead to
        // ArrayIndexOutOfBoundsException
        // Here we try to add 6 elements in an array of size 5
        try {
            for (int i = 0; i <= 5; i++) {
                fixedSizeArray[i] = i * 10;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array size is fixed. Cannot add more elements.");
        }

        // Memory Wastage: If the array size is larger than needed, it results in unused
        // space
        int[] largeArray = new int[1000]; // Only using a few elements, rest are wasted
        largeArray[0] = 1;
        largeArray[1] = 2;
        System.out.println("Memory wastage: Only a few elements are used, rest of the array is wasted.");

        // Type Homogeneity: Arrays store elements of a single data type, mixing types
        // isn't allowed
        // Uncommenting the next line will cause a compile-time error
        // fixedSizeArray[2] = "String"; // Error: incompatible types

        // Lack of Built-in Methods: Arrays have limited functionalities for
        // adding/removing elements
        // For example, there's no direct way to remove an element, we need to manually
        // shift values
        int[] shiftArray = { 10, 20, 30, 40, 50 };
        System.out.println("Original Array: ");
        for (int num : shiftArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Manually shifting values to remove an element (e.g., removing element at
        // index 2)
        for (int i = 2; i < shiftArray.length - 1; i++) {
            shiftArray[i] = shiftArray[i + 1];
        }
        shiftArray[shiftArray.length - 1] = 0; // Resetting the last element

        System.out.println("After Removing Element at Index 2: ");
        for (int num : shiftArray) {
            System.out.print(num + " ");
        }
    }
}
