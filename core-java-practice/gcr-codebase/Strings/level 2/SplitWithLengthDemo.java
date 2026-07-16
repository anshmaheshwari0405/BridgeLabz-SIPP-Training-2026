import java.util.Scanner;
public class SplitWithLengthDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int len=0;
        for(int i=0;i<text.length();i++) len++;
        int spaces=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ') spaces++;
        }
        String[] words=new String[spaces];
        int start=0,index=0;
        for(int i=0;i<=len;i++){
            if(i==len||text.charAt(i)==' '){
                String w="";
                for(int j=start;j<i;j++) w+=text.charAt(j);
                words[index++]=w;
                start=i+1;
            }
        }
        String[][] data=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            int wlen=0;
            for(int j=0;j<words[i].length();j++) wlen++;
            data[i][0]=words[i];
            data[i][1]=String.valueOf(wlen);
        }
        System.out.println("Word\tLength");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+Integer.parseInt(data[i][1]));
        }
        sc.close();
    }
}