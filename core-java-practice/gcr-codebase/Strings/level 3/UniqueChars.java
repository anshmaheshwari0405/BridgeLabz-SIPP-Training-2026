import java.util.Scanner;
public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int len=0;
        try { while(true){ text.charAt(len); len++; } } catch(Exception e){}
        char[] unique=new char[len];
        int k=0;
        for(int i=0;i<len;i++){
            char c=text.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++){
                if(c==text.charAt(j)){ found=true; break; }
            }
            if(!found){ unique[k++]=c; }
        }
        char[] result=new char[k];
        for(int i=0;i<k;i++) result[i]=unique[i];
        for(char c:result) System.out.print(c+" ");
        sc.close();
    }
}