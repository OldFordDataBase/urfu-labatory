import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ (сдвиг, целое число):");
        // Нормализуем ключ, чтобы он был в диапазоне 0-25
        int key = (scanner.nextInt() % 26 + 26) % 26;
        scanner.nextLine(); // Очистка буфера

        // Шифрование
        String encryptedText = cipher(text, key, true);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String choice = scanner.nextLine().toLowerCase();

            if ("y".equals(choice)) {
                // Дешифрование
                String decryptedText = cipher(encryptedText, key, false);
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
    // mode = true для шифрования, false для дешифрования
    public static String cipher(String text, int shift, boolean encryptMode) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int offset = c - base;
                int newOffset;

                if (encryptMode) {
                    newOffset = (offset + shift) % 26;
                } else {
                    // +26 для обработки отрицательных результатов (например, 'a' - 5)
                    newOffset = (offset - shift + 26) % 26;
                }
                result.append((char) (base + newOffset));
            } else {
                // Не-буквы оставляем как есть
                result.append(c);
            }
        }
        return result.toString();
    }
}