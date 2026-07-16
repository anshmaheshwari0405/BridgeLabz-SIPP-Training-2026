import java.util.Scanner;
public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        String trimmed = "";
        for (int i = start; i <= end; i++) trimmed += text.charAt(i);
        String builtin = text.trim();
        boolean equal = true;
        if (trimmed.length() != builtin.length()) equal = false;
        else {
            for (int i = 0; i < trimmed.length(); i++) {
                if (trimmed.charAt(i) != builtin.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println("Custom Trim: [" + trimmed + "]");
        System.out.println("Built-in Trim: [" + builtin + "]");
        System.out.println("Are equal? " + equal);
        sc.close();
    }
}