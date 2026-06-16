import java.util.Scanner;
public class FreqWithUnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int len=text.length(); 
        char[] unique=new char[len];
        int k=0;
        for(int i=0;i<len;i++){
            char c=text.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++) if(c==text.charAt(j)) found=true;
            if(!found) unique[k++]=c;
        }
        int[] freq=new int[256];
        for(int i=0;i<len;i++) freq[text.charAt(i)]++;
        for(int i=0;i<k;i++) System.out.println(unique[i]+" "+freq[unique[i]]);
        sc.close();
    }
}