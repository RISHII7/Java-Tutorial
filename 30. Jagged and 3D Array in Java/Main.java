public class Main {
    public static void main(String[] args) {
        // Example of a jagged array (array with varying column sizes)
        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[2];

        // Example of a regular two-dimensional array
        int twoDArray[][] = new int[3][4];

        // Example of a regular three-dimensional array
        int threeDArray[][][] = new int[3][4][5];

        // Filling the 2D Array with random numbers
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = (int) (Math.random() * 100); // Random number between 0-9
            }
        }

        // Printing the two-dimensional array
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        // Initializing and printing a sample three-dimensional array
        System.out.println("\nThree-Dimensional Array:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    threeDArray[i][j][k] = (int) (Math.random() * 10); // Random number between 0-9
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
