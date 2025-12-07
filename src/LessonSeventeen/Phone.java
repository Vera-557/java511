package LessonSeventeen;

public class Phone {
//Задание 6: Класс "Телефон" (Phone)
//Что нужно сделать:
//Создайте класс Phone с полями: brand, model, price, batteryLevel (уровень батареи), isOn (включен ли)
//Создайте конструкторы (минимум 3 варианта)
//Создайте методы: turnOn(), turnOff(), charge(int minut), use(int hours) (использование уменьшает батарею)
//Создайте метод getInfo() возвращающий строку с информацией о телефоне
//В main создайте массив из 4 телефонов и симулируйте день использования
private String brand;
    private String model;
    private double price;
    private int batteryLevel; // в процентах от 0 до 100
    private boolean isOn;

    public Phone(String brand, String model, double price, int batteryLevel, boolean isOn) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        setBatteryLevel(batteryLevel);
        this.isOn = isOn;
    }

    public Phone(String brand, String model, double price, int batteryLevel) {
        this(brand, model, price, batteryLevel, false);
    }

    public Phone(String brand, String model) {
        this(brand, model, 0, 100, false);
    }

    public void turnOn() {
        if (batteryLevel < 5) {
            System.out.println(brand + " " + model + ": Недостаточно заряда для включения! (" + batteryLevel + "%)");
            return;
        }
        if (!isOn) {
            isOn = true;
            batteryLevel -= 1; // На включение тратится 1% заряда
            System.out.println(brand + " " + model + ": Телефон включен. Батарея: " + batteryLevel + "%");
        } else {
            System.out.println(brand + " " + model + ": Телефон уже включен");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " " + model + ": Телефон выключен");
        } else {
            System.out.println(brand + " " + model + ": Телефон уже выключен");
        }
    }

    public void charge(int minutes) {
        if (minutes <= 0) {
            System.out.println("Время зарядки должно быть положительным");
            return;
        }

        int chargePerMinute = 2;
        int chargeAmount = Math.min(minutes * chargePerMinute, 100 - batteryLevel);

        batteryLevel += chargeAmount;
        System.out.println(brand + " " + model + ": Заряжаем " + minutes + " минут...");
        System.out.println("Добавлено " + chargeAmount + "% заряда. Текущий уровень: " + batteryLevel + "%");

        if (batteryLevel >= 100) {
            System.out.println(brand + " " + model + ": Телефон полностью заряжен!");
        }
    }
    public void use(int hours) {
        if (hours <= 0) {
            System.out.println("Время использования должно быть положительным");
            return;
        }

        if (!isOn) {
            System.out.println(brand + " " + model + ": Телефон выключен! Включите его сначала.");
            return;
        }

        int drainPerHour = 15; //допустим 15% в час использования
        int drainAmount = hours * drainPerHour;

        if (drainAmount >= batteryLevel) {
            int possibleHours = batteryLevel / drainPerHour;
            System.out.println(brand + " " + model + ": Недостаточно заряда для " + hours + " часов использования");
            System.out.println("Можно использовать только " + possibleHours + " часов");

            if (possibleHours > 0) {
                batteryLevel -= possibleHours * drainPerHour;
                System.out.println("Использовано " + possibleHours + " часов. Осталось заряда: " + batteryLevel + "%");

                if (batteryLevel <= 0) {
                    batteryLevel = 0;
                    isOn = false;
                    System.out.println(brand + " " + model + ": Телефон разрядился и выключился!");
                }
            }
        } else {
            batteryLevel -= drainAmount;
            System.out.println(brand + " " + model + ": Использовано " + hours + " часов");
            System.out.println("Потрачено " + drainAmount + "% заряда. Осталось: " + batteryLevel + "%");

            if (batteryLevel < 10) {
                System.out.println("ВНИМАНИЕ: Низкий заряд батареи! (" + batteryLevel + "%)");
            }
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Цена не может быть отрицательной");
            return;
        }
        this.price = price;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0) {
            this.batteryLevel = 0;
        } else if (batteryLevel > 100) {
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }
    public String getInfo() {
        String status = isOn ? "Включен" : "Выключен";
        String batteryStatus;

        if (batteryLevel >= 70) batteryStatus = "🔋 Высокий";
        else if (batteryLevel >= 30) batteryStatus = "🔋 Средний";
        else if (batteryLevel >= 10) batteryStatus = "🔋 Низкий";
        else batteryStatus = "🔋 Критический";

        return String.format(
                " %s %s\n" +
                        " Цена: %.2f руб.\n" +
                        " Состояние: %s\n" +
                        " Батарея: %d%% (%s)\n" +
                        "------------------------",
                brand, model, price, status, batteryLevel, batteryStatus
        );
    }
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", batteryLevel=" + batteryLevel +
                ", isOn=" + isOn +
                '}';
    }

    public static void main(String[] args) {
        Phone[] phones = new Phone[4];

        phones[0] = new Phone("Apple", "iPhone 15", 99990, 85, false);
        phones[1] = new Phone("Samsung", "Galaxy S23", 79990, 50);
        phones[2] = new Phone("Xiaomi", "Redmi Note 12", 25990, 100, true);
        phones[3] = new Phone("Google", "Pixel 7");
        phones[3].setBatteryLevel(30);
        for (Phone phone : phones) {
            System.out.println("Используем телефон " + phone.getBrand() + "...");
            phone.turnOn();
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Все пользуются телефонами утром:");
        phones[0].use(1);
        phones[1].use(2);
        phones[2].use(1);
        phones[3].use(1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Рабочее использование телефонов:");
        phones[0].use(2);
        phones[1].use(1);
        phones[2].turnOff();
        phones[3].use(1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Быстрая зарядка во время обеда:");
        for (Phone phone : phones) {
            if (phone.getBatteryLevel() < 40) {
                phone.charge(15);
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Активное вечернее использование:");
        phones[2].turnOn();
        phones[0].use(3);
        phones[1].use(2);
        phones[2].use(1);
        phones[3].use(2);
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < phones.length; i++) {
            System.out.println("Телефон #" + (i + 1) + ":");
            System.out.println(phones[i].getInfo());
        }
    }

}
