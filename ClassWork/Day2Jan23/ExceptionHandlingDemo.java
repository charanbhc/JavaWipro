public class ExceptionHandlingDemo {

    // Method to calculate division, declares that it throws an exception
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero."); // Custom exception message
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        // Inbuilt inputs
        int numerator = 10;  // Predefined numerator
        int denominator = 2; // Predefined denominator

        try {
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);

            // Call the method that might throw an exception
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Catch block to handle arithmetic exceptions
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block to handle unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Finally block to execute cleanup code
            System.out.println("Thank you for using the division program.");
        }
    }
}


// try	Defines a block of code to test for exceptions.
// catch	Defines a block of code to handle exceptions thrown in the try block.
// throw	Used to explicitly throw an exception.
// throws	Declares exceptions that a method can throw, requiring the caller to handle them.
// finally	Defines a block of code that will always execute, regardless of an exception.