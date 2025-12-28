package LessonTwentyFour;
/*
Задание 3: Статус заказа
Создай enum OrderStatus со значениями: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
Напиши метод isCompleted(), который возвращает true, если статус заказа является конечным (т.е. DELIVERED или CANCELLED).
 */
public enum OrderStatus {
    NEW ("Создан"){
        @Override
        boolean isCompleted() {
            return false;
        }
    }, PROCESSING("В обработке") {
        @Override
        boolean isCompleted() {
            return false;
        }
    }, SHIPPED("Отгружен") {
        @Override
        boolean isCompleted() {
            return false;
        }
    }, DELIVERED("Доставлен") {
        @Override
        boolean isCompleted() {
            return true;
        }
    }, CANCELLED ("Завершен") {
        @Override
        boolean isCompleted() {
            return true;
        }
    };
    abstract boolean isCompleted();
    final String status;
    OrderStatus(String status){
        this.status = status;
    }
}
