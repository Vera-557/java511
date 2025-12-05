package Java511YostEncapsulation.Second;

public class Country {
    private String name;
    private int population;
    private double area;
    private String capital;
    private boolean haveSea;
    //конструктор с одним параметром — названием страны
    Country(String name){
        this.name = name;
    }
    // по условию нужны сеттеры всех полей, хоть мы будем это поле задавать через конструктор
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean getHaveSea() {
        return haveSea;
    }

    public void setHaveSea(boolean haveSea) {
        this.haveSea = haveSea;
    }
}
