public abstract class Car implements Printable{
    private String model;
    private int year;
    private String color;

    public Car(String model, int year,String color) {
        this.model = model;
        this.year = year;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
