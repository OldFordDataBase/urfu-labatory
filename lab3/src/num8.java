public class num8 {
    public static void main(String[] args) {
        char[] array = new char[10];
        char letter = 'A';
        int idx = 0;

        // Гласные, которые пропускаем
        String vowels = "AEIOU";

        while (idx < array.length) {
            if (vowels.indexOf(letter) == -1) {   // согласная
                array[idx++] = letter;
            }
            letter++;
        }

        System.out.print("Массив: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}
