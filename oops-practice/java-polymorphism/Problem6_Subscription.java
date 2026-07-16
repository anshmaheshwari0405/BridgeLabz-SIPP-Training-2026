abstract class Subscription{
    String subscriberName,subscriptionId;
    Subscription(String n,String i){subscriberName=n;subscriptionId=i;}
    abstract double calculateMonthlyCharge();
}
class BasicPlan extends Subscription{BasicPlan(String n,String i){super(n,i);}double calculateMonthlyCharge(){return 199;}}
class PremiumPlan extends Subscription{PremiumPlan(String n,String i){super(n,i);}double calculateMonthlyCharge(){return 499;}}
class FamilyPlan extends Subscription{FamilyPlan(String n,String i){super(n,i);}double calculateMonthlyCharge(){return 799;}}
public class Problem6_Subscription{
    public static void main(String[] args){
        Subscription[] s={new BasicPlan("Alice","1"),new PremiumPlan("Bob","2"),new FamilyPlan("Amy","3")};
        double rev=0;Subscription max=s[0];
        for(Subscription x:s){
            rev+=x.calculateMonthlyCharge();
            if(x.calculateMonthlyCharge()>max.calculateMonthlyCharge())max=x;
            if(x.subscriberName.startsWith("A"))System.out.println(x.subscriberName);
            if(x.subscriptionId.equals("2"))System.out.println("Found Bob");
        }
        System.out.println("Revenue="+rev);
        System.out.println("Most expensive="+max.subscriberName);
    }
}
