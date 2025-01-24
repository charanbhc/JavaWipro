class StaticNonStatic {
    int nonStaticVar = 10;
    static int staticVar = 20;

    public static void main(String[] args) {
        StaticNonStatic obj1 = new StaticNonStatic();
        StaticNonStatic obj2 = new StaticNonStatic();

        obj1.nonStaticVar++;
        staticVar++;

        System.out.println("Object 1 - Non-Static: " + obj1.nonStaticVar + ", Static: " + staticVar);
        System.out.println("Object 2 - Non-Static: " + obj2.nonStaticVar + ", Static: " + staticVar);
    }
}
