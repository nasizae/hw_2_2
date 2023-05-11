public class MercedesBenz extends Car implements Printable{
    private int price;

    public MercedesBenz(String model, int age,String color, int price) {
        super(model, age,color);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("model:"+getModel()+
                "\nage:"+getAge()+
                "\ncolor:"+getColor()+
                "\nprice:"+this.price+"$");
    }
}
