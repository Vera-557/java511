package LessonTwentyOne.DataStorage;

public class DatabaseStorage implements DataStorage{
    private String data;
    @Override
    public void save(String data) {
        setData(data);
        System.out.println("Базы сохранены");
    }

    private void setData(String data) {
        if (data.isEmpty()){
            System.out.println("Адрес базы данных пустой");
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
        return "Ваша база данных удалена ";
    }
}
