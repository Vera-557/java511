package LessonTwentyOne.DataStorage;

public class CloudStorage implements DataStorage {
    private String data;
    @Override
    public void save(String data) {
        setData(data);
        System.out.println("Фотографии и видео сохранены");
    }

    private void setData(String data) {
        if (data.isEmpty()){
            System.out.println("Не удалось подгрузить файл");
            return;
        }
        this.data = data;
    }

    private String getData() {
        return data;
    }

    @Override
    public String load() {
        return getData();
    }

    @Override
    public String delete() {
        data = "";
        return "Все данные облака очищены";
    }
}
