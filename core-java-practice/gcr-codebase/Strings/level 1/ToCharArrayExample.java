import java.util.Arrays;
import java.util.Scanner;
public class ToCharArrayExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.next();
        char[] customChars=new char[text.length()];
        for(int i=0;i<text.length();i++){
            customChars[i]=text.charAt(i);
        }
        char[] builtInChars=text.toCharArray();
        boolean areEqual=true;
        if(customChars.length!=builtInChars.length){
            areEqual=false;
        }else{
            for(int i=0;i<customChars.length;i++){
                if(customChars[i]!=builtInChars[i]){
                    areEqual=false;
                    break;
                }
            }
        }
        System.out.println("Custom char array: "+Arrays.toString(customChars));
        System.out.println("Built-in char array: "+Arrays.toString(builtInChars));
        System.out.println("Arrays equal? "+areEqual);
        sc.close();
    }
}