import java.util.*;
public class CompareStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        boolean res=true;
        if(str1.length()!=str2.length()) res=false;
        else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i))
                {
                    res=false;
                    break;
                }
            }
        }
        boolean result=str1.equals(str2);
        System.out.println("Custom compare result: " + res);
        System.out.println("Built-in equals() result: " + result);
        System.out.println("Both results same? " + (res == result));
        sc.close();
    }
}