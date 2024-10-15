public class Main {

    public static void main(String[] args) {

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifying the string
        System.out.println("StringBuilder Result: " + sb.toString());

        sb.insert(6, "Java "); // Inserting into the string
        System.out.println("After Insertion (StringBuilder): " + sb.toString());

        sb.replace(6, 10, "Programming"); // Replacing part of the string
        System.out.println("After Replacement (StringBuilder): " + sb.toString());

        sb.delete(6, 17); // Deleting part of the string
        System.out.println("After Deletion (StringBuilder): " + sb.toString());

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World"); // Modifying the string
        System.out.println("StringBuffer Result: " + sbf.toString());

        sbf.insert(6, "Java "); // Inserting into the string
        System.out.println("After Insertion (StringBuffer): " + sbf.toString());

        sbf.replace(6, 10, "Programming"); // Replacing part of the string
        System.out.println("After Replacement (StringBuffer): " + sbf.toString());

        sbf.delete(6, 17); // Deleting part of the string
        System.out.println("After Deletion (StringBuffer): " + sbf.toString());
    }
}
