class VowelConsonant {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowels = 0, consonants = 0;
        String str = input.toLowerCase().replaceAll("[^a-z]", "");

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else consonants++;
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
