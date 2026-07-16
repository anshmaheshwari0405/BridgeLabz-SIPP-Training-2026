
interface FoodDelivery{
    void deliverFood();

    default void trackOrder(){
        System.out.println("Tracking Food Order...");
    }

    static String generateDeliveryCode(){
        return "FD"+(int)(Math.random()*1000);
    }
}
interface GroceryDelivery{
    void deliverGroceries();

    default void trackOrder(){
        System.out.println("Tracking Grocery Order...");
    }
}
class DeliveryExecutive implements FoodDelivery,GroceryDelivery{

    public void deliverFood(){
        System.out.println("Food Delivered.");
    }

    public void deliverGroceries(){
        System.out.println("Groceries Delivered.");
    }

    public void trackOrder(){
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public static void main(String[] args){
        String[] customers={"Shubham","Rahul","Aman"};

        DeliveryExecutive d=new DeliveryExecutive();

        for(String c:customers){
            System.out.println("Customer: "+c);
            System.out.println("Delivery Code: "+FoodDelivery.generateDeliveryCode());
            d.deliverFood();
            d.deliverGroceries();
            d.trackOrder();
            System.out.println();
        }
    }
}
