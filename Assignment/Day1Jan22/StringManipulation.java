class StringManipulation {
    public static void main(String[] args) {
        String input = "Wipro";
        String str = input.toLowerCase().replaceAll("[^a-z]", "");
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            }
        }
    }
}
