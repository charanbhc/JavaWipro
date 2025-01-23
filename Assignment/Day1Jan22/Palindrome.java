class Palindrome {
    public static void main(String[] args) {
        String input = "Madam";
        String str = input.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome" : "Not Palindrome");
    }
}
