import java.util.Scanner;
public class StringLengthDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.println("Custom Length: "+count);
        System.out.println("Built-in Length: "+str.length());
        sc.close();
    }
}