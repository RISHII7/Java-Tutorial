public class Main {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;
        
        if (n % 2 == 0) {
            result = 10;
        } else {
            result = 20;
        }
        System.out.println(result);
        
        int n2 = 5;
        int result2 = 0;
        
        result2 = n2 % 2 == 0 ? 10 : 20;
        System.out.println(result2);
    }
}