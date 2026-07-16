import java.util.Scanner;
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int vowels=0,consonants=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c>='A'&&c<='Z')c=(char)(c+32);
            if(c>='a'&&c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        sc.close();
    }
}