public class Main {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // Assigning different variable names to each boolean expression
        boolean result1 = x > y && a < b; // true
        boolean result2 = x > y || a < b; // true
        boolean result3 = x > y && a > b; // false
        boolean result4 = x > y || a > b; // true
        boolean result5 = x < y && a < b; // false
        boolean result6 = x < y || a < b; // true
        boolean result7 = x < y || a < b || a > 1; // true

        // Printing each result
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
        System.out.println("result5: " + result5);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        // Final result checking if a is greater than b and negating it
        boolean result8 = a > b; // false
        System.out.println("Negated result8: " + !result8); // true
    }
}
