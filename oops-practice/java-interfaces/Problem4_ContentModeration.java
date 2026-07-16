
interface TextModeration{
    boolean checkOffensive(String post);

    default void displayModerationPolicy(){
        System.out.println("No offensive content allowed.");
    }

    static boolean containsRestrictedWords(String post){
        return post.toLowerCase().contains("hate");
    }
}
interface SpamDetection{
    boolean checkSpam(String post);

    default void displayModerationPolicy(){
        System.out.println("Spam is prohibited.");
    }
}
class ContentModerator implements TextModeration,SpamDetection{

    public boolean checkOffensive(String post){
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post){
        return post.toLowerCase().contains("buy now");
    }

    public void displayModerationPolicy(){
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args){
        String[] posts={
            "Buy now and get discount",
            "I hate everyone",
            "Have a nice day"
        };

        ContentModerator cm=new ContentModerator();

        for(String p:posts){
            if(cm.checkSpam(p))
                System.out.println("Spam Post: "+p);
            else if(cm.checkOffensive(p))
                System.out.println("Offensive Post: "+p);
            else
                System.out.println("Valid Post: "+p);
        }
    }
}
