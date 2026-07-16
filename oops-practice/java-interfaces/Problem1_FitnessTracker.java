
interface Trackable{
    void logActivity();
    default void resetData(){
        System.out.println("Data Reset.");
    }
}
interface Reportable{
    void generateReport();
}
interface Notifiable{
    void sendAlert();
}
class FitnessDevice implements Trackable, Reportable, Notifiable{
    public void logActivity(){
        System.out.println("Activity Logged.");
    }
    public void generateReport(){
        System.out.println("Fitness Report Generated.");
    }
    public void sendAlert(){
        System.out.println("Alert Sent.");
    }
    public static void main(String[] args){
        FitnessDevice d=new FitnessDevice();
        d.logActivity();
        d.generateReport();
        d.sendAlert();
        d.resetData();
    }
}
