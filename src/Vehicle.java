/**
 * Create by Дмитрий Рывков on 19.05.2017.
 */
abstract class Vehicle {

    private final String brand;
    private final int power;
    private int weight;
    private final String color;
    private final String condition;
    private final int numberOfSpeeds;
    private final String price;
    private double energyCapacity;
    private String typeOfMotor;

    Vehicle(String brand, int power, int weight, String color, String condition, int numberOfSpeeds, String price) {
        this.brand = brand;
        this.power = power;
        this.weight = weight;
        this.color = color;
        this.condition = condition;
        this.numberOfSpeeds = numberOfSpeeds;
        this.price = price;

    }

    Vehicle(String brand, int power, int weight, String color, String condition, int numberOfSpeeds,
            String price, double energyCapacity, String typeOfMotor){
        this(brand, power, weight, color, condition, numberOfSpeeds, price);

        this.energyCapacity = energyCapacity;
        this.typeOfMotor = typeOfMotor;

    }


   void show(){

        System.out.println("Brand - "+brand);
        System.out.println("Power = "+power);
        System.out.println("Weight = "+ weight);
        System.out.println("Color = "+ color);
        System.out.println("Condition = "+ condition);
        System.out.println("Number of speeds = "+ numberOfSpeeds);
        System.out.println("Price = "+ price);

        if(energyCapacity!=0){
            System.out.println("Energe Capacity - "+energyCapacity);
        }

        if(typeOfMotor!=null) {
            System.out.println("Type of motor - "+typeOfMotor);
        }

        System.out.println("");

    }

}