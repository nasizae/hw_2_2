public class Toyota extends Car implements Printable{
    private int speed;

    public Toyota(String model, int year,String color, int speed) {
        super(model, year,color);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("model:"+getModel()+
                "\nyear:"+getYear()+
                "\ncolor:"+getColor()+
                "\nspeed:"+this.speed+"km/h");
    }
}
