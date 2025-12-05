package Java511YostEncapsulation.Second;

public class Main {
    public static void main(String[] args) {
        Country england = new Country("Англия");
        england.setCapital("Лондон");
        england.setPopulation(56_489_800);
        england.setArea(130_278);
        england.setHaveSea(true);
        Country chehy = new Country("Чехия");
        chehy.setCapital("Прага");
        chehy.setPopulation(10_524_167);
        chehy.setArea(78_866);
        chehy.setHaveSea(false);

        Country [] countries = {england, chehy};
        for (Country country : countries){
            System.out.println("Страна: " + country.getName() + ", столица: " + country.getCapital() + ", население: " + country.getPopulation() + ", площадь: " +
                    country.getArea() + ", с выходом к морю: " + country.getHaveSea());
        }
    }
}
