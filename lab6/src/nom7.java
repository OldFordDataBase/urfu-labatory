import java.util.Arrays;

class SymbolToCode {
    public static int[] convertToCodes(char[] symbols) {
        int[] codes = new int[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            codes[i] = (int) symbols[i];
        }
        return codes;
    }
}

// Пример использования
public class nom7 {
    public static void main(String[] args) {
        char[] chars = {'A', 'b', 'C', '1'};
        int[] codes = SymbolToCode.convertToCodes(chars);
        System.out.println(Arrays.toString(codes)); // [65, 98, 67, 49]
    }
}