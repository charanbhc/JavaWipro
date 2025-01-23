package Class.Day1Jan22;
public class car { // Class name should start with an uppercase letter (convention)
    int i = 10; // Instance variable
    static int k = 18; // Static variable

    public static void main(String[] args) {
        // Accessing the instance variable 'i' requires creating an object of the class
        car carInstance = new car();
        System.out.println(carInstance.i); // Access instance variable through the object

        // Accessing the static variable 'k'
        System.out.println(car.k);

        // Local variable
        int j = 15; // Local variable (stored in stack)
        System.out.println(j);
    }
}
