class VariableTypes {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    void method() {
        int localVar = 30; // Local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.method();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
