import java.util.Scanner;
public class SplitCompareDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int len=0;
        for(int i=0;i<text.length();i++) len++;
        int spaces=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ') spaces++;
        }
        String[] manual=new String[spaces];
        int start=0,index=0;
        for(int i=0;i<=len;i++){
            if(i==len||text.charAt(i)==' '){
                String w="";
                for(int j=start;j<i;j++) w+=text.charAt(j);
                manual[index++]=w;
                start=i+1;
            }
        }
        String[] builtin=text.split(" ");
        boolean same=true;
        if(manual.length!=builtin.length) same=false;
        else{
            for(int i=0;i<manual.length;i++){
                if(!manual[i].equals(builtin[i])){
                    same=false;
                    break;
                }
            }
        }
        System.out.println("Are both same? "+same);
        sc.close();
    }
}