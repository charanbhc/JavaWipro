class DefaultValues {
    int instanceVar;
    static double staticVar;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default Instance Variable: " + obj.instanceVar);
        System.out.println("Default Static Variable: " + staticVar);
    }
}
