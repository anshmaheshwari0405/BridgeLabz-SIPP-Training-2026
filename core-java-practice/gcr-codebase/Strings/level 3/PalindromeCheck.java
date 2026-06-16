import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int start = 0, end = text.length() - 1;
        boolean isPal = true;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Logic1: " + isPal);
        start = 0;
        end = text.length() - 1;
        boolean recPal = true;
        while (true) {
            if (start >= end) break;
            if (text.charAt(start) != text.charAt(end)) {
                recPal = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Logic2: " + recPal);
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = text.charAt(arr.length - 1 - i);
        }
        boolean arrPal = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rev[i]) arrPal = false;
        }
        System.out.println("Logic3: " + arrPal);
        sc.close();
    }
}