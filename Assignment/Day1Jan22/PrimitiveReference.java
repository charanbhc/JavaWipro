class PrimitiveReference {
    public static void main(String[] args) {
        int primitive = 10;
        int copy = primitive;
        copy++;
        System.out.println("Primitive: " + primitive + ", Copy: " + copy);

        int[] reference = {1, 2, 3};
        int[] refCopy = reference;
        refCopy[0] = 99;
        System.out.println("Reference[0]: " + reference[0]);
    }
}
