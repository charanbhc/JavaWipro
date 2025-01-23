class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2; // Number of rotations
        boolean right = true; // Rotate right or left

        int len = arr.length;
        n = n % len;
        if (!right) n = len - n;

        int[] rotated = new int[len];
        for (int i = 0; i < len; i++) {
            rotated[(i + n) % len] = arr[i];
        }

        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}
