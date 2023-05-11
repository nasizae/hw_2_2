public class BMW extends Car implements Printable{
private String typeCar;

    public BMW(String model, int year,String color, String typeCar) {
        super(model, year,color);
        this.typeCar = typeCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    @Override
    public void print() {
        System.out.println("model:"+getModel()+
                "\nyear:"+getYear()+
                "\ncolor:"+getColor()+
                "\ntype:"+this.typeCar);
    }
}
