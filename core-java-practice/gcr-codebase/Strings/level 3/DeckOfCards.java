import java.util.Scanner;
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int numOfCards=suits.length*ranks.length;
        String[] deck=new String[numOfCards];
        int index=0;
        for(String suit:suits){
            for(String rank:ranks){
                deck[index++]=rank+" of "+suit;
            }
        }
        for(int i=0;i<numOfCards;i++){
            int randomCardNumber=i+(int)(Math.random()*(numOfCards-i));
            String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
        System.out.print("Enter number of players: ");
        int players=sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int n=sc.nextInt();
        if(n%players!=0){
            System.out.println("Cards cannot be evenly distributed!");
            return;
        }
        int cardsPerPlayer=n/players;
        String[][] distributed=new String[players][cardsPerPlayer];
        index=0;
        for(int i=0;i<players;i++){
            for(int j=0;j<cardsPerPlayer;j++){
                distributed[i][j]=deck[index++];
            }
        }
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1)+":");
            for(String card:distributed[i]){
                System.out.println("  "+card);
            }
            System.out.println();
        }
        sc.close();
    }
}