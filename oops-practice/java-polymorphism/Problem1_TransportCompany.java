abstract class Vehicle{
    String name;
    Vehicle(String name){this.name=name;}
    abstract double fuelCost(int km);
}
class Car extends Vehicle{
    Car(String n){super(n);}
    double fuelCost(int km){return km*6;}
}
class Bus extends Vehicle{
    Bus(String n){super(n);}
    double fuelCost(int km){return km*12;}
}
class Bike extends Vehicle{
    Bike(String n){super(n);}
    double fuelCost(int km){return km*2;}
}
class ElectricCar extends Vehicle{
    ElectricCar(String n){super(n);}
    double fuelCost(int km){return km*1.2;}
}
public class Problem1_TransportCompany{
    public static void main(String[] args){
        Vehicle[] v={new Car("C1"),new Bus("B1"),new Bike("BK1"),new ElectricCar("E1")};
        for(Vehicle x:v){
            if(x instanceof Car) System.out.println("Car");
            else if(x instanceof Bus) System.out.println("Bus");
            else if(x instanceof Bike) System.out.println("Bike");
            else if(x instanceof ElectricCar) System.out.println("ElectricCar");
            System.out.println(x.name+" Fuel Cost="+x.fuelCost(100));
        }
    }
}
