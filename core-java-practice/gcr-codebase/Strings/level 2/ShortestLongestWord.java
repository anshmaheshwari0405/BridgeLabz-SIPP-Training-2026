import java.util.Scanner;
public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int spaces=1;
        for(int i=0;i<text.length();i++)if(text.charAt(i)==' ')spaces++;
        String[] words=new String[spaces];
        int start=0,index=0;
        for(int i=0;i<=text.length();i++){
            if(i==text.length()||text.charAt(i)==' '){
                String w="";
                for(int j=start;j<i;j++)w+=text.charAt(j);
                words[index++]=w;
                start=i+1;
            }
        }
        String shortest=words[0],longest=words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length()<shortest.length())shortest=words[i];
            if(words[i].length()>longest.length())longest=words[i];
        }
        System.out.println("Shortest: "+shortest);
        System.out.println("Longest: "+longest);
        sc.close();
    }
}
// java