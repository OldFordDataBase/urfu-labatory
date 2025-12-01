class IntPair {
    private int a, b;

    public IntPair() {
        a = 0;
        b = 0;
    }

    public IntPair(int x) {
        a = x;
        b = 0;
    }

    public IntPair(int x, int y) {
        a = x;
        b = y;
    }

    public void print() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        new IntPair().print();
        new IntPair(5).print();
        new IntPair(3, 7).print();
    }
}
