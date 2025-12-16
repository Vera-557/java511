package LessonEighteen.Incapsulation;
/*
Создай класс Password с приватным полем для хранения пароля.
Добавь метод для установки пароля (минимум 8 символов), метод для проверки пароля
 (сравнение с введенным) и запрети прямое получение пароля (нет геттера).
 */
public class Password {
    private String password = "";

    public void setPassword(String password) {
        if (password.length() < 8){
            System.out.println("Установите пароль минимум 8 символов");
            return;
        } else if (this.password.equals(password)) {
            System.out.println("Пароль должен отличаться от текущего");
            return;
        }
        this.password = password;
        System.out.println("Пароль успешно установлен!");
    }
    boolean passwordChecker (String password){
        return this.password.equals(password);//
    }

}
