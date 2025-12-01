java
class MixedConstructor {
    private char symbol;
    private int number;

    public MixedConstructor(char c, int n) {
        symbol = c;
        number = n;
    }

    public MixedConstructor(double value) {
        symbol = (char) value;
        number = (int) ((value - (int) value) * 100);
    }

    public void printFields() {
        System.out.println("Symbol: " + symbol + ", Number: " + number);
    }

    public static void main(String[] args) {
        new MixedConstructor('B', 42).printFields();
        new MixedConstructor(65.1267).printFields();
    }
}
