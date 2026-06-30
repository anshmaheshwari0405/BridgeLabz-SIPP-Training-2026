
interface StreamingService{
    void streamMovie();

    default void showSubscriptionDetails(){
        System.out.println("Streaming Subscription Active");
    }
}
interface GamingService{
    void playGame();

    default void showSubscriptionDetails(){
        System.out.println("Gaming Subscription Active");
    }
}
class SmartTV implements StreamingService,GamingService{

    public void streamMovie(){
        System.out.println("Streaming Movie...");
    }

    public void playGame(){
        System.out.println("Playing Game...");
    }

    public void showSubscriptionDetails(){
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args){
        String[] movies={"Avengers","Inception","Interstellar"};
        String[] games={"FIFA","Minecraft","PUBG"};

        SmartTV tv=new SmartTV();
        tv.showSubscriptionDetails();

        System.out.println("Movies:");
        for(String m:movies) System.out.println(m);

        System.out.println("Games:");
        for(String g:games) System.out.println(g);
    }
}
