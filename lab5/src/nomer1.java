class SymbolHandler {
    private char symbol;

    public void setSymbol(char c) {
        symbol = c;
    }

    public int getCode() {
        return (int) symbol;
    }

    public void printSymbolAndCode() {
        System.out.println("Symbol: " + symbol + ", Code: " + getCode());
    }

    public static void main(String[] args) {
        SymbolHandler sh = new SymbolHandler();
        sh.setSymbol('G');
        sh.printSymbolAndCode();
    }
}
