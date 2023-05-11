public class Main {
    public static void main(String[] args) {
       Car[] cars=new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("------------");
            cars[0]=createObject("Mercedes");
            cars[1]=createObject("Toyota");
            cars[2]=createObject("BMW");
            cars[i].print();
        }
    }
    public static Car createObject(String className){
        Car car=null;
        if(className=="Mercedes"){
            car=new MercedesBenz("E210",2002,"Gray",8000);
        }
        else if(className=="Toyota"){
            car=new Toyota("Camry",2015,"White",200);
        }
        else if(className=="BMW"){
            car=new BMW("BMW3",2014,"Black","Sedan");
        }
        else{
            System.out.println(" ");
        }
return car;
    }
}
