import java.util.Scanner;

public class exhard {

    // алфавит
    private static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "0123456789 .,!?-\n"; // \n для переноса строки

    private static final int ALPHABET_LENGTH = ALPHABET.length();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("(Собственный алфавит) Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ (сдвиг, целое число):");
        int key = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Шифрование
        String encryptedText = customCipher(text, key, true);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String choice = scanner.nextLine().toLowerCase();

            if ("y".equals(choice)) {
                // Дешифрование
                String decryptedText = customCipher(encryptedText, key, false);
                System.out.println("Расшифрованный текст: " + decryptedText);
                break;
            } else if ("n".equals(choice)) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }
        scanner.close();
    }

    public static String customCipher(String text, int key, boolean encryptMode) {
        StringBuilder result = new StringBuilder();

        // Нормализуем ключ, чтобы он не был слишком большим
        int shift = key % ALPHABET_LENGTH;

        for (char c : text.toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index == -1) {
                // Символа нет в алфавите, оставляем как есть
                result.append(c);
            } else {
                // Символ найден, вычисляем сдвиг
                int newIndex;
                if (encryptMode) {
                    newIndex = (index + shift + ALPHABET_LENGTH) % ALPHABET_LENGTH;
                } else {
                    // + ALPHABET_LENGTH для обработки отрицательного сдвига
                    newIndex = (index - shift + ALPHABET_LENGTH) % ALPHABET_LENGTH;
                }
                result.append(ALPHABET.charAt(newIndex));
            }
        }
        return result.toString();
    }
}