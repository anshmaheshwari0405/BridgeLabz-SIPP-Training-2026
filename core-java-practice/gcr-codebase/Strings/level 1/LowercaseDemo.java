import java.util.Scanner;
public class LowercaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String manualLower = "";
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                manualLower += (char)(ch + 32);
            } else {
                manualLower += ch;
            }
        }
        String builtInLower = text.toLowerCase();
        boolean isSame = true;
        if(manualLower.length() != builtInLower.length()) {
            isSame = false;
        } else {
            for(int i = 0; i < manualLower.length(); i++){
                if(manualLower.charAt(i) != builtInLower.charAt(i)){
                    isSame = false;
                    break;
                }
            }
        }
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both same? " + isSame);
        sc.close();
    }
}