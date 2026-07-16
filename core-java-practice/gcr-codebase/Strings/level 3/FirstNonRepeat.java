import java.util.Scanner;
public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] freq=new int[256];
        for(int i=0;i<text.length();i++) freq[text.charAt(i)]++;
        char ans=0;
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)]==1){ ans=text.charAt(i); break; }
        }
        if(ans!=0) System.out.println(ans); else System.out.println("None");
        sc.close();
    }
}