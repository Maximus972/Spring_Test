package web.model;

public class Car {
    private String model;
    private int year;
    private int series;

    public Car(String model, int year, int series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getSeries() {
        return series;
    }
}
