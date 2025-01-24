class VariableScope {
    int x = 10; // Class-level variable

    void method() {
        int x = 20; // Method-level variable
        {
            int y = 30; // Block-level variable
            System.out.println("Block-level x: " + x);
        }
        System.out.println("Method-level x: " + x);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        System.out.println("Class-level x: " + obj.x);
        obj.method();
    }
}
