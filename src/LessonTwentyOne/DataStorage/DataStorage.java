package LessonTwentyOne.DataStorage;

public interface DataStorage {
    void save(String data);

    String load();

    String delete();

    static String getStorageType() {
        return "Data Storage System";
    }

    default String backup() {
        return "Создание резервной копии";
    }
}
