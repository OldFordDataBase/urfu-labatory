class Counter {
    private static int staticCounter = 0; // закрытое статическое поле

    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + staticCounter);
        staticCounter++;
    }
}

// Пример использования
public class nom2 {
    public static void main(String[] args) {
        Counter.showAndIncrement(); // Текущее значение: 0
        Counter.showAndIncrement(); // Текущее значение: 1
        Counter.showAndIncrement(); // Текущее значение: 2
    }
}