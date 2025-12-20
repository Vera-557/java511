package LessonTwentyOne.DataStorage;
@SuppressWarnings({"All"})
public class FileStorage implements DataStorage{
    private String data;
    @Override
    public void save(String data) {
        setData(data);
        System.out.println("Данные сохранены");
    }

    private void setData(String data) {
        if (data.isEmpty()){
            System.out.println("Ваша строка пустая");
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
        return "Ваша строка удалена ";
    }
}
