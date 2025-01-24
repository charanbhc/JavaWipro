class Shadowing {
    int x = 10; // Class-level variable

    void method() {
        int x = 20; // Method-level variable
        System.out.println("Method-level x: " + x);
    }

    public static void main(String[] args) {
        Shadowing obj = new Shadowing();
        System.out.println("Class-level x: " + obj.x);
        obj.method();
    }
}
