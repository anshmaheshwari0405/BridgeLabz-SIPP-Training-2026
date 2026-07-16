abstract class Vehicle{
    String vehicleNumber,ownerName;
    Vehicle(String v,String o){vehicleNumber=v;ownerName=o;}
    abstract double calculateToll();
}
class Car extends Vehicle{Car(String v,String o){super(v,o);}double calculateToll(){return 100;}}
class Bus extends Vehicle{Bus(String v,String o){super(v,o);}double calculateToll(){return 250;}}
class Truck extends Vehicle{Truck(String v,String o){super(v,o);}double calculateToll(){return 400;}}
public class Problem5_Toll{
    static double revenue(Vehicle[] a){double s=0;for(Vehicle v:a)s+=v.calculateToll();return s;}
    static Vehicle search(Vehicle[] a,String id){for(Vehicle v:a)if(v.vehicleNumber.equals(id))return v;return null;}
    public static void main(String[] args){
        Vehicle[] a={new Car("C1","A"),new Bus("B1","B"),new Truck("T1","C")};
        int c=0,b=0,t=0;Vehicle max=a[0];
        for(Vehicle v:a){if(v.calculateToll()>max.calculateToll())max=v;
            if(v instanceof Car)c++;else if(v instanceof Bus)b++;else t++;}
        System.out.println("Revenue="+revenue(a));
        System.out.println("Highest="+max.vehicleNumber);
        System.out.println("Counts "+c+" "+b+" "+t);
        System.out.println(search(a,"B1").ownerName);
    }
}
