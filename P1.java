// Operations.java
public class P1 {
    // Method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method for subtractionyes
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        P1 operations = new P1();

        int num1 = 10, num2 = 5;

        System.out.println("Addition: " + operations.add(num1, num2));
        System.out.println("Subtraction: " + operations.subtract(num1, num2));
    }
}