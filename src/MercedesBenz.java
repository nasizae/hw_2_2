public class MercedesBenz extends Car implements Printable{
    private int price;

    public MercedesBenz(String model, int year,String color, int price) {
        super(model, year,color);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("model:"+getModel()+
                "\nyear:"+getYear()+
                "\ncolor:"+getColor()+
                "\nprice:"+this.price+"$");
    }
}
