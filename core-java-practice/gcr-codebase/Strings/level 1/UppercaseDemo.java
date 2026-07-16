import java.util.Scanner;
public class UppercaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String manualUpper = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                manualUpper += (char)(ch - 32);
            } else {
                manualUpper += ch;
            }
        }
        String builtInUpper = text.toUpperCase();
        boolean isSame = true;
        if(manualUpper.length() != builtInUpper.length()) {
            isSame = false;
        } else {
            for(int i = 0; i < manualUpper.length(); i++){
                if(manualUpper.charAt(i) != builtInUpper.charAt(i)){
                    isSame = false;
                    break;
                }
            }
        }
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both same? " + isSame);
        sc.close();
    }
}