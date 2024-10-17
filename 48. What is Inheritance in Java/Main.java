class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    };

    public int sub(int n1, int n2) {
        return n1 - n2;
    };
}

class AdvCalc extends Calc { // AdvCalc inherits from calc
    public int multi(int n1, int n2) {
        return n1 * n2;
    };

    public int div(int n1, int n2) {
        return n1 / n2;
    };
}

public class Main {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc(); // Correct object type
        int r1 = obj.add(4, 5); // Using inherited method
        int r2 = obj.sub(7, 3); // Using inherited method
        int r3 = obj.multi(5, 3); // Using method from AdvCalc
        int r4 = obj.div(15, 3); // Using method from AdvCalc

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
