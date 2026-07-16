import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}