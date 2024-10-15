class Student {
    int rollno;
    String name;
    int marks;
}

public class Main {
    public static void main(String[] args) {
        // Creating three student objects
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        // Printing details of the first student
        System.out.println(s1.name + ": " + s1.marks);

        // Array of Student objects
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Iterating through the array using a traditional for loop
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].marks);
        }

        // Iterating through the array using an enhanced for loop
        for (Student stud : students) {
            System.out.println(stud.name + ": " + stud.marks);
        }

        // Array of integers
        int[] nums = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // Traditional for loop to print the integer array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Enhanced for loop to print the integer array
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
