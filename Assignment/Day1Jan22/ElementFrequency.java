import java.util.HashMap;
class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 1};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        System.out.println(freq);
    }
}
