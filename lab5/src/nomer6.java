class MinMax {
    private int min;
    private int max;

    public MinMax() {
        min = 0;
        max = 0;
    }

    public MinMax(int a) {
        min = a;
        max = a;
    }

    public MinMax(int a, int b) {
        setValues(a, b);
    }

    public void setValues(int... args) {
        int currentMin = min;
        int currentMax = max;

        for (int val : args) {
            currentMin = Math.min(currentMin, val);
            currentMax = Math.max(currentMax, val);
        }

        min = currentMin;
        max = currentMax;
    }

    public void printValues() {
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {
        MinMax m1 = new MinMax(5, 10);
        m1.printValues();
        m1.setValues(3);
        m1.printValues();
        m1.setValues(20, 1);
        m1.printValues();
    }
}
