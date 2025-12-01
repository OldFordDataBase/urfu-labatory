class SymbolRange {
    private char start;
    private char end;

    public SymbolRange(char a, char b) {
        start = a;
        end = b;
    }

    public void printRange() {
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SymbolRange sr = new SymbolRange('A', 'D');
        sr.printRange();
    }
}
