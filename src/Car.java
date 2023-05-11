public abstract class Car implements Printable{
    private String model;
    private int age;
    private String color;

    public Car(String model, int age,String color) {
        this.model = model;
        this.age = age;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }
}
