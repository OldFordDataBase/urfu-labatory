class LimitedInt {
    private int value;

    public LimitedInt() {
        value = 0;
    }

    public LimitedInt(int val) {
        setValue(val);
    }

    public void setValue() {
        value = 0;
    }

    public void setValue(int val) {
        value = Math.min(val, 100);
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        LimitedInt a = new LimitedInt();
        LimitedInt b = new LimitedInt(150);
        a.setValue(80);
        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());
    }
}
