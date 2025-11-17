import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class timus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Используем Map: Key = Faculty Name, Value = List of Student Names
        Map<String, List<String>> faculties = new HashMap<>();

        // 1. Инициализируем списки для всех факультетов
        faculties.put("Slytherin", new ArrayList<>());
        faculties.put("Hufflepuff", new ArrayList<>());
        faculties.put("Gryffindor", new ArrayList<>());
        faculties.put("Ravenclaw", new ArrayList<>());

        // Читаем N
        int n = Integer.parseInt(scanner.nextLine());

        // Читаем и сохраняем студентов
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            String facultyName = scanner.nextLine();

            // Добавляем студента в список его факультета
            faculties.get(facultyName).add(studentName);
        }

        // Вывод в строгом порядке
        String[] facultyOrder = {"Slytherin", "Hufflepuff", "Gryffindor", "Ravenclaw"};

        for (int i = 0; i < facultyOrder.length; i++) {
            String facultyName = facultyOrder[i];

            // Печатаем название факультета
            System.out.println(facultyName + ":");

            // Печатаем список студентов
            List<String> students = faculties.get(facultyName);
            for (String student : students) {
                System.out.println(student);
            }

            // Печатаем пустую строку между факультетами (но не после последнего)
            if (i < facultyOrder.length - 1) {
                System.out.println();
            }
        }

        scanner.close();
    }
}