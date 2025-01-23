public class Voter {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to check voting eligibility
    public String isEligibleForVote() {
        if (age >= 18) {
            return name + " is eligible to vote.";
        } else {
            return name + " is not eligible to vote.";
        }
    }

    // Main method to test the Voter class
    public static void main(String[] args) {
        Voter voter1 = new Voter("Alice", 20);
        System.out.println(voter1.isEligibleForVote()); // Output: Alice is eligible to vote.

        Voter voter2 = new Voter("Bob", 16);
        System.out.println(voter2.isEligibleForVote()); // Output: Bob is not eligible to vote.

        // Update age using setter
        voter2.setAge(19);
        System.out.println(voter2.isEligibleForVote()); // Output: Bob is eligible to vote.

        // Invalid age example
        voter2.setAge(-5); // Output: Age cannot be negative.
    }
}
