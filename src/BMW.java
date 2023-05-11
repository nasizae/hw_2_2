public class BMW extends Car implements Printable{
private String typeCar;

    public BMW(String model, int age,String color, String typeCar) {
        super(model, age,color);
        this.typeCar = typeCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    @Override
    public void print() {
        System.out.println("model:"+getModel()+
                "\nage:"+getAge()+
                "\ncolor:"+getColor()+
                "\ntype:"+this.typeCar);
    }
}
