class DataHandler {
    private String symbolicField;
    private String textualField;

    public DataHandler() {
        this.symbolicField = null;
        this.textualField = "";
    }

    // Перегруженные методы присваивания
    public void assignValue(String value) {
        this.symbolicField = value;
    }

    public void assignValue(String[] values) {
        this.textualField = String.join(" ", values);
    }

    // Геттеры для проверки
    public String getSymbolicField() {
        return symbolicField;
    }

    public String getTextualField() {
        return textualField;
    }
}


public class nom1 {
    public static void main(String[] args) {
        DataHandler dh = new DataHandler();
        dh.assignValue("Hello");
        System.out.println(dh.getSymbolicField()); // Hello

        dh.assignValue(new String[]{"Java", "is", "powerful"});
        System.out.println(dh.getTextualField()); // Java is powerful
    }
}