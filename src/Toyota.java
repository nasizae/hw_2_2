public class Toyota extends Car implements Printable{
    private int speed;

    public Toyota(String model, int age,String color, int speed) {
        super(model, age,color);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("model:"+getModel()+
                "\nage:"+getAge()+
                "\ncolor:"+getColor()+
                "\nspeed:"+this.speed+"km/h");
    }
}
