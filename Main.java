//Base Class
 abstract class Vehicle{
    private int maxSpeed;
    private String fuelType;
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public String getfuelType(){
        return fuelType;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public abstract void drive();
}
interface Maintenance { 
    void performMaintenance(); }
//Subclass Car
class Car extends Vehicle implements Maintenance {
    public Car(int maxSpeed,String fuelType){
        super(maxSpeed,fuelType);
    }
    public void drive() { 
        System.out.println("Driving a car at speed: " + getMaxSpeed() + " km/h");
     }
     public void performMaintenance(){
        System.out.println("Performing maintenance on the car.");
     }
}
// Subclass Truck 
class Truck extends Vehicle implements Maintenance { 
    public Truck(int maxSpeed, String fuelType) { 
        super(maxSpeed,fuelType);
     } 
      public void drive() {
         System.out.println("Driving a truck at speed: " + getMaxSpeed() + " km/h");
         }
         public void performMaintenance() { 
            System.out.println("Performing maintenance on the truck."); 
    } 
}
class Bus extends Vehicle implements Maintenance{
    public Bus(int maxSpeed, String fuelType){
        super(maxSpeed, fuelType);
    }
    public void drive(){
        System.out.println("Driving a bus at speed:" + getMaxSpeed() + "km/h");
    }
    public void performMaintenance(){
        System.out.println("Performing maintenance on the bus.");
    }
}
public class Main{
    public static void main(String[] args) {
    //   Vehicle myCar=new Car(180,"Petrol");
    //   Vehicle myTruck=new Truck(120,"Diesel");
    //   Vehicle myBus=new Bus(150,"Diesel");
    //   myCar.drive();
    //   myTruck.drive();
    //   myBus.drive();
    //   ((Maintenance)myCar).performMaintenance();
    //   ((Maintenance)myTruck).performMaintenance();
    //   ((Maintenance)myBus).performMaintenance();
    Car c=new Car(180,"Petrol");
    Truck t=new Truck(100,"Diesel");
    Bus b=new Bus(150,"Diesel");
    c.drive();
    t.drive();
    b.drive();
    c.performMaintenance();
    t.performMaintenance();
    b.performMaintenance();

    }
}