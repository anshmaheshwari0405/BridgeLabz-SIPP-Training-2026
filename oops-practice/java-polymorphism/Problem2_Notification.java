abstract class Notification{
    String recipientName,message;
    Notification(String r,String m){recipientName=r;message=m;}
    abstract void sendNotification();
}
class EmailNotification extends Notification{
    EmailNotification(String r,String m){super(r,m);}
    void sendNotification(){System.out.println("Email sent to "+recipientName+": "+message);}
}
class SMSNotification extends Notification{
    SMSNotification(String r,String m){super(r,m);}
    void sendNotification(){System.out.println("SMS sent to "+recipientName+": "+message);}
}
class PushNotification extends Notification{
    PushNotification(String r,String m){super(r,m);}
    void sendNotification(){System.out.println("Push sent to "+recipientName+": "+message);}
}
public class Problem2_Notification{
    public static void main(String[] args){
        Notification[] arr={new EmailNotification("Alice","Hi"),new SMSNotification("Bob","OTP"),new PushNotification("Carol","Offer")};
        for(Notification n:arr)n.sendNotification();
    }
}
