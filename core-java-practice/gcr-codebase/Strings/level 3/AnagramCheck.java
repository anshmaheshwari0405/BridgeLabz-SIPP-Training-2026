import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){ System.out.println("Not Anagram"); return; }
        int[] freq1=new int[256];
        int[] freq2=new int[256];
        for(int i=0;i<s1.length();i++) freq1[s1.charAt(i)]++;
        for(int i=0;i<s2.length();i++) freq2[s2.charAt(i)]++;
        boolean isAna=true;
        for(int i=0;i<256;i++) if(freq1[i]!=freq2[i]){ isAna=false; break; }
        System.out.println(isAna?"Anagram":"Not Anagram");
        sc.close();
    }
}