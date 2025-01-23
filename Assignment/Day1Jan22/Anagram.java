import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagrams" : "Not Anagrams");
    }
}
