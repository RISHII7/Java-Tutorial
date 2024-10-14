public class Main {
    public static void main(String[] args) {
        // Without an array, managing multiple similar variables becomes cumbersome.
        int score1 = 85;
        int score2 = 90;
        int score3 = 88;
        int score4 = 92;
        int score5 = 76;

        // Printing each score individually
        System.out.println("Scores without array:");
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        System.out.println(score4);
        System.out.println(score5);
        
        // The need for an array:
        // Instead of managing separate variables, we can use an array to store all scores together.
        int[] scores = {85, 90, 88, 92, 76}; // An array to store all scores

        System.out.println("\nScores using array:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]); // Using a loop to access each score
        }
    }
}
