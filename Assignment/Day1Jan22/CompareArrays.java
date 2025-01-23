class CompareArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] == b[i] ? "Equal" : a[i] > b[i] ? "Greater" : "Lesser");
        }
    }
}
