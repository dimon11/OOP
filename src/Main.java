/**
 * Created by Дмитрий Рывков on 20.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        Car BMW1 = new Car("BMW 750", 343,2100,"red", "new", 6,
                "50000$",4.5,"petrol");

        Bicycle BMX1 = new Bicycle("BMX", 0,21,"pink", "used 1 year",
                21, "500$");

        Bike Honda = new Bike("Honda", 120,450,"green", "new", 6,
                "20000$",1.8,"petrol");



        BMW1.show();
        BMX1.show();
        Honda.show();
        

    }
}
