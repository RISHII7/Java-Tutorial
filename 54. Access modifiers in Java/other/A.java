package other;

public class A {
    public int marks = 6; // default access
    protected int protectedMarks = 6; // corrected declaration

    public void show() {
        System.out.println("In class A, marks: " + marks);
    }
}