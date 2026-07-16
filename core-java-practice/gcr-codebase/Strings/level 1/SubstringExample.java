import java.util.Scanner;
public class SubstringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=sc.next();
        System.out.print("Enter start index: ");
        int start=sc.nextInt();
        System.out.print("Enter end index: ");
        int end=sc.nextInt();
        String customSub="";
        for(int i=start;i<end;i++){
            customSub+=text.charAt(i);
        }
        String builtInSub=text.substring(start,end);
        boolean areEqual=true;
        if(customSub.length()!=builtInSub.length()){
            areEqual=false;
        }else{
            for(int i=0;i<customSub.length();i++){
                if(customSub.charAt(i)!=builtInSub.charAt(i)){
                    areEqual=false;
                    break;
                }
            }
        }
        System.out.println("Custom substring: "+customSub);
        System.out.println("Built-in substring: "+builtInSub);
        System.out.println("Are they equal? "+areEqual);
        sc.close();
    }
}