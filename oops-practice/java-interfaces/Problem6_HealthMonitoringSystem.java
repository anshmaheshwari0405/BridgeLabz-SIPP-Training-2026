
interface HeartRateMonitor{
    void showHeartRate();

    default void displayHealthTips(){
        System.out.println("Exercise Daily.");
    }
}
interface TemperatureMonitor{
    void showTemperature();

    default void displayHealthTips(){
        System.out.println("Drink Enough Water.");
    }

    static boolean isPatientIdValid(String patientId){
        return patientId.startsWith("P");
    }
}
class HealthMonitoringSystem implements HeartRateMonitor,TemperatureMonitor{

    public void showHeartRate(){
        System.out.println("Heart Rate: 75 BPM");
    }

    public void showTemperature(){
        System.out.println("Temperature: 98.6 F");
    }

    public void displayHealthTips(){
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public static void main(String[] args){
        String[] names={"John","Emma","Alex"};
        String[] ids={"P101","A202","P303"};

        HealthMonitoringSystem h=new HealthMonitoringSystem();

        for(int i=0;i<names.length;i++){
            System.out.println("\nPatient: "+names[i]);
            System.out.println("ID Valid: "+TemperatureMonitor.isPatientIdValid(ids[i]));
            h.showHeartRate();
            h.showTemperature();
        }

        System.out.println("\nFinal Health Report Generated.");
    }
}
